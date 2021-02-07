package com.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 把动态代理类封装为可以用的工具类
public class ProxyInvocationHandler implements InvocationHandler {
    // 被代理的接口
    private Object target;

    public void setTarget(Object target)
    {
        this.target = target;
    }

    // 生成代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target,args);
        return result;
    }
}
