package com.tage.aop;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by tage on 3/28/16.
 */

@Aspect
@Component
public class LogInterceptor {
    @Before("execution(public void com.tage.dao.impl.UserDAOImpl.save(com.tage.model.User))")
    public void before() {
        System.out.println("method start");
    }
}


