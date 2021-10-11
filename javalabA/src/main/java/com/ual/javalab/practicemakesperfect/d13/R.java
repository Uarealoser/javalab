package com.ual.javalab.practicemakesperfect.d13;

import java.lang.reflect.Field;

public class R {
    private static String IDCARD;

    private String name;

    private int age;

    private R father;

    @Override
    public String toString() {
        return "R{" +
                "name='" + name + '\'' +
                ", age=" + age +",IDCARD="+IDCARD+ ",father="+father+
                '}';
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        R r = new R();
        Class<R> clazz = R.class;

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(r,"ual");
        Field age = clazz.getDeclaredField("age");
        age.set(r,24);
        Field idcard = clazz.getDeclaredField("IDCARD");
        idcard.setAccessible(true);
        idcard.set(clazz,"id1");

        Field father = clazz.getDeclaredField("father");
        father.setAccessible(true);
        father.set(r,new R());
        System.out.println(r);
    }
}
