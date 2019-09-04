package cn.eleven.aop.xml;


/**
 * @description: 切面增强类
 * @date: 2019-09-04 19:25
 * @author: 十一
 */
public class LogAfterAndBeforeAspect {


    public void interceptorMethod() {
    }
    public void before() {
        System.out.println("目标方法执行前调用 ====>");
    }

    public void after() {
        System.out.println("目标方法执行后调用 ====>");
    }

}
