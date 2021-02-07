package com.demo3;

public class Client {
    public static void main(String[] args) {
        // 真实角色
        host host = new host();
        // 代理角色
        ProxyInvocationHandler p = new ProxyInvocationHandler();
        // 通过调用程序处理角色来处理我们要调用的接口对象
        p.setRent(host);
        Rent proxy = (Rent)p.getProxy();
        proxy.rent();
    }
}
