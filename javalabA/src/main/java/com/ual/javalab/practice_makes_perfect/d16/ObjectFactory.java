package com.ual.javalab.practice_makes_perfect.d16;

public class ObjectFactory {
    public static Object getInstance(String className){
        try {
            Class<?> o = Class.forName(className);
            return o.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 采用泛型进行改进
    public static <T> T getInstance(Class<T> clazz){
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 由于会在外部类的静态方法中创建该内部类，根据外部类静态方法不能创建非静态内部类实例的原则，这里的内部类需要为静态内部类
    static class Person {
        private String name;

        // 无参构造器时必要的
        public Person(){}

        public void hello(){
            System.out.println("hello:"+name);
        }
    }

    // 外部类同样需要无参构造器
    public ObjectFactory(){}

    public static void main(String[] args) {
        // 不采用泛型时
        Person p1 = (Person)ObjectFactory.getInstance(Person.class.getName());
        p1.hello();

        // 采用泛型
        Person p2 = ObjectFactory.getInstance(Person.class);
        p2.hello();
    }
}
