package com.ual.javalab.practicemakesperfect;

import java.util.ArrayList;
import java.util.List;

public class Fruit<T extends Number & java.io.Serializable> {
    T color;

    Fruit(T color){
        this.color = color;
    }

    public static void main(String[] args) {
        ArrayList<String> from = new ArrayList<>();
        ArrayList<Object> to = new ArrayList<>();
        array2List(from,to);
    }

    public static <T>  void array2List(List<? extends T> from, List<T> to){
        for (T o:from
             ) {
            to.add(o);
        }
    }
}

