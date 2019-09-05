package cn.eleven.aop.dynamicproxy.jdk;


public class Test {

    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        UserService proxy = (UserService) ProxyUtil.getProxy(userService);
        proxy.deleteAll();
        /**
         * JDK 动态代理机制只能对接口进行代理，其原理是动态生成一个代理类，这个代理类实现了目标
         * 对象的接口，目标对象和代理类都实现了接口，但是目标对象和
         * 代理类的 Class 对象是不一样的，所以两者是没法相互赋值的。
         */
        System.out.println("目标对象和代理对象是否一致：" + (proxy instanceof UserServiceImpl));
    }
}
