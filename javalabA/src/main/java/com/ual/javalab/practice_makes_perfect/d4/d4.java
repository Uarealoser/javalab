package com.ual.javalab.practice_makes_perfect.d4;

public class d4 {
    private String op = "outclass object field";

    private class Innerclass{
        private String ip = "innerclass object field";
        public void info(){
            System.out.println(d4.this.op);// 访问外部类实例变量
            System.out.println(this.ip); // 访问内部类实例变量
        }
    }

    public void test(){
        Innerclass innerclass = new Innerclass();
        innerclass.info();
    }

    public static void main(String[] args) {
        new d4().test();
    }
}
