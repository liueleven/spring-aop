package cn.eleven.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @description: 切面增强类
 * @date: 2019-09-04 19:25
 * @author: 十一
 */
@Aspect
@Component
public class LogAroundAspect {

    @Pointcut("execution(* cn.eleven.aop.annotation.UserService.deleteAll())")
    public void interceptorMethod() {
    }


    @Around("interceptorMethod()")
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
