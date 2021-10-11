package com.ual.javalab.practicemakesperfect.d15;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    // 需要被代理的对象
    private Object target;

    public void setTarget(Object target){
        this.target = target;
    }

    // 指定代理对象的所有方法时，都会被替换成如下invoke方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        DogUtil.m1();
        Object ret = method.invoke(target, args);
        DogUtil.m2();
        return ret;
    }
}
