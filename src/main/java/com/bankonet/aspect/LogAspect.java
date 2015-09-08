package com.bankonet.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Aspect
@Component("logAspect")
public class LogAspect {

    @Around("execution(* com.bankonet.metier.*.*(..)) || execution(* com.bankonet.dao.*.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        String target = joinPoint.getTarget().getClass().getSimpleName();
        String method = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        System.out.println("----AOP---- " + target + "." + method + "() appelé avec " + Arrays.toString(args));

        try {
            Object result = joinPoint.proceed(args);
            System.out.println("----AOP---- " + target + "." + method + "() returning : " + result);
            return result;
        } catch (Throwable throwable) {
            throw throwable;
        }
    }

}
