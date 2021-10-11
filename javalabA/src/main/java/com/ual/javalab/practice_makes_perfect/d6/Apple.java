package com.ual.javalab.practice_makes_perfect.d6;

import java.util.ArrayList;
import java.util.List;

public class Apple<T> {
    private T color;

    Apple(T color){ // 构造函数不需要声明泛型
        this.color = color;
    }

    public static void main(String[] args) {
        iterateList(new ArrayList<String>(){{
            add("a");
            add("b");
            add("c");
        }});
    }

    public static void iterateList(List<?> c){
        for (int i = 0;i<c.size();i++){
            System.out.println(c.get(i));
        }
    }
}
