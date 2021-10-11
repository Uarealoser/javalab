package com.ual.javalab.practice_makes_perfect.d8;

import java.util.concurrent.TimeUnit;

public class CatchExceptionDemo {
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            System.out.println("before throwChecked");
            // 调用抛出Checked异常方法
            try {
                throwChecked(1);
                System.out.println("after throwChecked");
            } catch (Exception e) {
                System.out.println("catch throwChecked");
            }
        }).start();

        new Thread(()->{
                System.out.println("before throwRuntime");
                // 调用抛出Runtime 异常方法, 可以不用理会
                throwRuntime(1);
                System.out.println("after throwRuntime");

        }).start();
        TimeUnit.SECONDS.sleep(10);
    }

    public static void throwChecked(int a) throws Exception{
        if (a>0){
            throw new Exception("a>0");
        }
    }

    public static void throwRuntime(int a){
        if (a>0){
            throw new RuntimeException("a>0");
        }
    }
}
