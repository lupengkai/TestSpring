package com.tage.aop;


/*import org.aspectj.lang.ProceedingJoinPoint;*/

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by tage on 3/28/16.
 */

/*@Aspect
@Component*/
public class LogInterceptor {

    // @Pointcut("execution(public * com.tage.service..*.add(..))")
    public void myMethod() {

    }


    //@Before("myMethod()")
    public void before() {
        System.out.println("method before");
    }


    // @AfterReturning("myMethod()")
    public void afterReturning() {
        System.out.println("method after returning");

    }

    //@AfterThrowing("myMethod()")
    public void afterThrowing() {
        System.out.println("method after throwing");

    }
/*
  @Around("myMethod()")
    public void aroundMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("method around start");
      proceedingJoinPoint.proceed();
      System.out.println("method around end");

    }
*/


}