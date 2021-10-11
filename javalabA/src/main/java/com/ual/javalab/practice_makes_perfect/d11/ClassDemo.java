package com.ual.javalab.practice_makes_perfect.d11;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassDemo {
    private ClassDemo(){
        System.out.println("私有无参构造器");
    }

    public ClassDemo(String name){
        System.out.println("公有有参构造器，参数："+name);
    }

    public void info(){
        System.out.println("公有无参方法");
    }

    public void info(String name){
        System.out.println("公有有参方法,参数:"+name);
    }

    class Inner{

    }

    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        // 获取ClassDemo 对应的 Class实例clazz
        Class<ClassDemo> clazz = ClassDemo.class;
        System.out.println("当前类Class实例:"+clazz);

        // 获取该Class 所有的 构造器
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();

        System.out.println("全部构造器:");
        for (Constructor<?> c:declaredConstructors
             ) {
            System.out.println(c);
        }
        System.out.println("public 构造器:");
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> c:
             constructors) {
            System.out.println(c);
        }

        System.out.println("public 方法:");
        Method[] methods = clazz.getMethods();
        for (Method m:
             methods) {
            System.out.println(m);
        }

        System.out.println("指定方法:");
        Method info = clazz.getMethod("info", String.class);
        System.out.println(info);

        System.out.println("获取类全部注解:");
        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation a:
             annotations) {
            System.out.println(a);
        }
        System.out.println(clazz.getAnnotation(SuppressWarnings.class));

        System.out.println("获取所有内部类:");
        Class<?>[] declaredClasses = clazz.getDeclaredClasses();
        for (Class<?> c:
             declaredClasses) {
            System.out.println(c);
        }
        
        // 使用Class.forName()方法加载内部类
        Class<?> innerClazz = Class.forName("com.ual.javalab.practice_makes_perfect.d11.ClassDemo$Inner");
        System.out.println("Inner内部类:"+innerClazz);

        // 通过内部类的Class实例对象的getDeclaredClasses，获取其外部类对象
        System.out.println("Inner内部类所在的外部类:"+innerClazz.getDeclaringClass());


        System.out.println("包名:"+clazz.getPackage());
        System.out.println("父类名:"+clazz.getSuperclass());


    }
}
