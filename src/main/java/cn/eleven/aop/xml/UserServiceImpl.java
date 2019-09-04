package cn.eleven.aop.xml;


/**
 * @description: 一定要写注释啊
 * @date: 2019-09-04 19:22
 * @author: 十一
 */
public class UserServiceImpl implements UserService {

    public void insert(String name, int age) {
        System.out.println("xml-保存信息，name：" + name + "，age: " + age);
    }

    public void deleteAll() {
        System.out.println("xml-删除所有");
    }
}
