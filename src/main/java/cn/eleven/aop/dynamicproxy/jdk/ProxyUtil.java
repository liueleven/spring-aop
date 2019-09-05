package cn.eleven.aop.dynamicproxy.jdk;

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
        Object proxyInstance = Proxy.newProxyInstance(
                object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new MyInvocationHandler(object));
        return proxyInstance;
    }

    /**
     * 需要实现InvocationHandler接口
     */
    private static class MyInvocationHandler implements InvocationHandler {
        /**
         * 目标对象
         */
        private Object object;

        public MyInvocationHandler(Object object) {
            this.object = object;
        }

        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("<=== jdk动态代理 业务增强处理...");
            return method.invoke(object,args);
        }
    }

}
