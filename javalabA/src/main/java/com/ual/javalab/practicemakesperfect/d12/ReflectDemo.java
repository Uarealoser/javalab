package com.ual.javalab.practicemakesperfect.d12;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {

    private String name;

    public ReflectDemo(){}

    public ReflectDemo(String name){
        this.name = name;
    }

    public void test(String name){
        System.out.println(name);
    }

    private void priTest(String name){
        System.out.println(name);
    }

    public static void stcFun(int a){
        System.out.println(a);
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 创建对象
        Class<ReflectDemo> clazz = ReflectDemo.class;
        ReflectDemo o = clazz.newInstance();

        Constructor<ReflectDemo> ctor = clazz.getConstructor();
        ReflectDemo o1 = ctor.newInstance();

        // 执行静态方法
        Method stcFun = clazz.getMethod("stcFun", int.class);
        stcFun.invoke(clazz,123);

        // 执行实例方法
        Method test = clazz.getMethod("test", String.class);
        test.invoke(o,"123"); // 其中o是函数的主要调

        Method pritest = clazz.getDeclaredMethod("priTest", String.class);
        pritest.setAccessible(true);
        pritest.invoke(o,"priTest");
    }
}
