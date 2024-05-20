package com.example.springinterviewpractice.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspect {

    @Before("execution(* com.example.springinterviewpractice.circular_dependency.*Controller.*(..))")
    public void beforeController(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String clasName = joinPoint.getTarget().getClass().getSimpleName();
        log.info("Before Executing class: {} - method {}", clasName, methodName);
    }

    @After("afterScopeController()")
    public void afterController(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        String clasName = joinPoint.getTarget().getClass().getSimpleName();
        log.info("After Executing class: {} - method {}", clasName, methodName);
    }

    @Pointcut("execution(* com.example.springinterviewpractice.scope.*.*.*Controller.*(..))")
    public void afterScopeController() {}
}
