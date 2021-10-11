package com.ual.javalab.practicemakesperfect.d6;

import java.util.List;

public class SubApple extends Apple<String>{
    SubApple(String color) {
        super(color);
    }

    public static void iterateList1(List<? extends Apple<String>> c){
        for (int i = 0;i<c.size();i++){
            System.out.println(c.get(i));
        }
    }
}
