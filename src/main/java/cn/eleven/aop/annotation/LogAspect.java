package cn.eleven.aop.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @description: 切面增强类
 * @date: 2019-09-04 19:25
 * @author: 十一
 */
@Aspect
@Component
public class LogAspect {



    @AfterReturning(value = "execution(* cn.eleven.aop.annotation.UserService.find(int))")
    public void afterReturning() {
        System.out.println("目标方法执行后调用，但是如果方法执行期间抛异常就不能执行了 ====>");

    }

    @AfterThrowing(value = "execution(* cn.eleven.aop.annotation.UserService.find(int))")
    public void afterThrowing() {
        System.out.println("目标方法执行后调用，但是要抛了异常才执行 ====>");

    }
}
