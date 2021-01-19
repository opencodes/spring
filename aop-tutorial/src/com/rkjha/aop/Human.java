package com.rkjha.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class Human {
    // Advice
    @Before( "allMethodStartWithStudy())")
    public void beforeStudy(JoinPoint j ){
        System.out.println(">> @Before Method: " + j.getSignature().getName() );
    }
    // Advice
    @After("allMethodStartWithStudy()")
    public void afterStudy(JoinPoint j){
        System.out.println(">> @After Method: " + j.getSignature().getName());
    }

    // Advice
    @AfterReturning(pointcut = "allMethodStartWithStudy()", returning = "result", value = "val")
    public void afterReturn(JoinPoint j, int result){

        System.out.println(">> @AfterReturning Method: " + j.getSignature().getName());
        System.out.print(" result = " + result);
        System.out.println("");
    }

    // Pointcut Expression
    @Pointcut("execution(public * study*(..))")
    public void allMethodStartWithStudy(){}
}
