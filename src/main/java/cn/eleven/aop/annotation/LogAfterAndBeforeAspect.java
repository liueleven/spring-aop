package cn.eleven.aop.annotation;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @description: 切面增强类
 * @date: 2019-09-04 19:25
 * @author: 十一
 */
@Aspect
@Component
public class LogAfterAndBeforeAspect {

    @Pointcut("execution(* cn.eleven.aop.annotation.UserService.*(String,int))")
    public void interceptorMethod() {
    }

    @Before("interceptorMethod()")
    public void before() {
        System.out.println("目标方法执行前调用 ====>");
    }

    @After("interceptorMethod()")
    public void after() {
        System.out.println("目标方法执行后调用 ====>");
    }

}
