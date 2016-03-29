package com.tage.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by tage on 3/28/16.
 */
public class LogInterceptor implements InvocationHandler {


    private Object target;

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }


    public void beforeMethod(Method method) {
        System.out.println(method.getName() + "   start");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeMethod(method);
        method.invoke(target, args);
        return null;
    }
}
