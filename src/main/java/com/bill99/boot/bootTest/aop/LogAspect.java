package com.bill99.boot.bootTest.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 编写切面
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.bill99.boot.bootTest.aop.Action)")
    public void  annotationPointCut(){};

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println(method.getName());
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截方法：" + action.name());
    }

    @Before("execution(* com.bill99.boot.bootTest.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature methodSignature =  (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("方法式拦截：" + method.getName());
    }
}
