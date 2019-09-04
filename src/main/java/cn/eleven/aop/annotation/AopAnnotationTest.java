package cn.eleven.aop.annotation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: 注解测试
 * @date: 2019-09-04 19:36
 * @author: 十一
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-annotation-aop.xml")
public class AopAnnotationTest {

    @Autowired
    private UserService userService;

    @Test
    public  void testBeforeAndAfter() {
        userService.insert("annotation-eleven",22);
    }

    @Test
    public  void testAround() {
        userService.deleteAll();
    }

    @Test
    public  void testAfterReturnException() {
        userService.find(0);
    }

    @Test
    public  void testAfterReturn() {
        userService.find(2);
    }

    @Test
    public  void testAfterThrowing() {
        userService.find(2);
    }
}
