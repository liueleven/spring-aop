package cn.eleven.aop.annotation;

import org.springframework.stereotype.Service;

/**
 * @description: 一定要写注释啊
 * @date: 2019-09-04 19:22
 * @author: 十一
 */
@Service
public class UserServiceImpl implements UserService {

    public void insert(String name, int age) {
        System.out.println("annotation-保存信息，name：" + name + "，age: " + age);
    }

    public void deleteAll() {
        System.out.println("annotation-删除所有");
    }

    public void find(int id) {
        System.out.println("annotation-查找 id="+id);
        if (id < 1) {
            throw new RuntimeException("id 不能小于1");
        }
        System.out.println("annotation-查找 id：" + id);
    }
}
