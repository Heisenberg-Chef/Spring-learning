package com.qi.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class log implements MethodBeforeAdvice {
    // method 要执行的目标对象的方法
    // object[] 是参数
    // object 目标对象
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"被执行了.");
    }


}
