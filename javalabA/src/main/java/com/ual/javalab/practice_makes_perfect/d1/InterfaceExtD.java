package com.ual.javalab.practice_makes_perfect.d1;

public interface InterfaceExtD {

    String ipsf = "interface public static final field";

    static void ism(){
        System.out.println("interface static method");
    }
    default void idm(){
        System.out.println("interface default method");
    }

    abstract void afun();
}
