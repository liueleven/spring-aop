package cn.eleven.aop.dynamicproxy.jdk;


public class Test {

    public static void main(String[] args) {
        UserService proxy = (UserService) ProxyUtil.getProxy(new UserServiceImpl());
        proxy.deleteAll();
    }
}