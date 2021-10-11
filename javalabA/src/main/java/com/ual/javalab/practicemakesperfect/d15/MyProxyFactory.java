package com.ual.javalab.practicemakesperfect.d15;

import java.lang.reflect.Proxy;

public class MyProxyFactory {
    //为指定target生成动态代理对象
    public static Object getProxy(Object target) throws Exception{
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.setTarget(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),new Class[]{Dog.class},myInvocationHandler);
    }
}

