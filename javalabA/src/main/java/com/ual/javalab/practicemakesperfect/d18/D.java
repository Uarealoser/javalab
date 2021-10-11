package com.ual.javalab.practicemakesperfect.d18;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public class D {
    public static void main(String[] args) throws NoSuchFieldException {
        Class<Person> clazz = Person.class;
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);

        // 针对普通类型，通过 getType即可获取字段的类型
        Class<?> type = name.getType();
        System.out.println("type of name is:"+type); // type of name is:class java.lang.String

        // 针对泛型类型，并获取不到具体的泛型信息
        Field maps = clazz.getDeclaredField("maps");
        maps.setAccessible(true);
        Class<?> type1 = maps.getType();
        System.out.println("type of maps is:"+type1); // type of maps is:interface java.util.Map

        // 需要通过如下方法获取
        Type genericType = maps.getGenericType();
        System.out.println("maps' genericType is:"+genericType); // maps' genericType is:java.util.Map<java.lang.String, java.lang.String>

        if (genericType instanceof ParameterizedType){
            ParameterizedType pType = (ParameterizedType)genericType;
            System.out.println("ParameterizedType is:"+pType); // ParameterizedType is:java.util.Map<java.lang.String, java.lang.String>
            Type rawType = pType.getRawType();
            System.out.println("rawType is:"+rawType); // rawType is:interface java.util.Map

            Type[] actualTypeArguments = pType.getActualTypeArguments();
            for (Type t:
                 actualTypeArguments) {
                System.out.println("actual type is:"+t); //actual type is:class java.lang.String,actual type is:class java.lang.String
            }
        }else {
            System.out.println("获取泛型类型出错");
        }
    }
}

class Person{
    private String name;
    private Map<String,String> maps;
}
