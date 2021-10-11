package com.ual.javalab.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SmsInvocationHandler implements InvocationHandler {

    private final Object target;

    public SmsInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before method "+method.getName());
        Object invoke = method.invoke(target, args);
        System.out.println("after method "+method.getName());
        return invoke;
    }

    public static void main(String[] args) {
        Object target = new SmsInterfaceImpl();
        SmsInterface proxy = (SmsInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个
                new SmsInvocationHandler(target)   // 代理对象对应的自定义 InvocationHandler
        );
        proxy.send("hello");
    }
}
