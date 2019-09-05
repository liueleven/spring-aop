package cn.eleven.aop.dynamicproxy.cglib;


public class Test {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceImpl proxy = (UserServiceImpl) ProxyUtil.getProxy(userService);

        proxy.deleteAll();

        /**
         * CGLIB 是对目标对象本身进行代理，所以无论目标对象是否有接口，都可以
         * 对目标对象进行代理，其原理是使用字节码生成工具在内存生成一个继承目标对象的
         * 代理类，然后创建代理对象实例。由于代理类的父类是目标对象，所以
         * 代理类是可以赋值给目标对象的，自然如果目标对象有接口，代理对象也是可以赋值给接口的。
         */
        System.out.println("目标对象和代理对象是否一致：" + (proxy instanceof UserServiceImpl));
    }
}
