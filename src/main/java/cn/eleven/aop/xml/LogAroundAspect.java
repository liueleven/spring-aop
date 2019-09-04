package cn.eleven.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @description: 切面增强类
 * @date: 2019-09-04 19:25
 * @author: 十一
 */
public class LogAroundAspect {

    public void interceptorMethod() {
    }

    public void around(ProceedingJoinPoint joinPoint) {
        System.out.println("环绕调用，目标方法调用前执行 ====>");

        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕调用，目标方法调用后执行 ====>");
    }

}
