package com.ual.javalab.practicemakesperfect.d15;

public class MonkiDog implements Dog{

    @Override
    public void info(String name) {
        System.out.println("i'm monki");
    }

    @Override
    public void run() {
        System.out.println("monki running");
    }
}
