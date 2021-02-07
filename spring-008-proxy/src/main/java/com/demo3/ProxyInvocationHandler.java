package com.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  我们会用这个类,自动生成代理类
 */
public class ProxyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的接口
     */
    private Rent rent;

    public void setRent(Rent rent)
    {
        this.rent = rent;
    }


    /**
     * 得到代理类
     */
    public Object getProxy()
    {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    /**
     *     处理代理实例并且返回结果
     *     真正调用的是proxy类中返回的对象实体
      */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**
         * 使用反射方式进行运行.
         */
        Object invoke = method.invoke(rent, args);

        return null;
    }
}
