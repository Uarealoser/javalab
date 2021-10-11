package com.ual.javalab.practicemakesperfect.d14;

import java.lang.reflect.Proxy;

public class InvocationDemo {
    public static void main(String[] args) {
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        // 第一个参数:加载代理对象的类加载器，第二个参数:代理对象需要实现的接口用Class数组的形式传入，第三个对象:代理对象执行接口方法时，实际调用的InvocationHandler
        Person o = (Person)Proxy.newProxyInstance(Person.class.getClassLoader(), new Class[]{Person.class}, myInvocationHandler);
        o.walk();
        o.syaHello("zzy");
    }
}
