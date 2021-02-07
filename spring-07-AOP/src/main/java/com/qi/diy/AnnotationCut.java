package com.qi.diy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect // 标记这个类是一个切面
public class AnnotationCut {

    @Before("execution(* com.qi.service.*.*(..))")
    public void before()
    {
        System.out.println("=====方法执行前=====");
    }

    @After("execution(* com.qi.service.*.*(..))")
    public void after()
    {
        System.out.println("=====执行方法后=====");
    }

    @Around("execution(* com.qi.service.*.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("执行前");
        Signature sign = joinPoint.getSignature();
        System.out.println("方法签名为:"+sign);
        joinPoint.proceed();
        System.out.println("执行后...");
    }
}
