package com.ual.javalab.practice_makes_perfect.d14;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    /**
     * 指定动态代理对象的所有方法时，都会被替换成如下invoke方法
     * @param proxy 代表动态代理对象
     * @param method 代表正在执行的方法
     * @param args 代表调用目标方法时传入的实参
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("正在执行的方法:"+method);
        if (args != null){
            System.out.println("方法入参为:");
            for (Object o:
                 args) {
                System.out.println(o);
            }
        }else {
            System.out.println("该方法没有入参");
        }
        return null;
    }
}
