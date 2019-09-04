package cn.eleven.aop.xml;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: xml测试
 * @date: 2019-09-04 19:36
 * @author: 十一
 */
public class AopXmlTest {

    private UserService userService;

    @Before
    public void setup() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-xml-aop.xml");
        userService = (UserService)context.getBean("userServiceImpl");
    }
    @Test
    public  void testBeforeAndAfter() {

        userService.insert("eleven-xml",22);
    }

    @Test
    public  void testAround() {
        userService.deleteAll();
    }
}
