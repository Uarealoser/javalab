package com.ual.javalab.practice_makes_perfect.d15;

import java.lang.reflect.Proxy;

public class MyProxyFactory2 {
    public static <T> T getProxy(Object target,Class<T> clazz){
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(target);
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), myInvocationHandler);
    }
}
