package cn.eleven.aop.dynamicproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-05 09:03
 * @author: 十一
 */
public class ProxyUtil {


    public static Object getProxy(final Object object) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }

   
    private static class MyMethodInterceptor implements MethodInterceptor {

        public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            System.out.println("<=== CGLib动态代理 业务增强处理...");
            return methodProxy.invokeSuper(object,args);
        }
    }

}
