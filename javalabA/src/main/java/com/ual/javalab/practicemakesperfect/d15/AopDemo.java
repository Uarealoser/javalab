package com.ual.javalab.practicemakesperfect.d15;

public class AopDemo {
    public static void main(String[] args) throws Exception {
        MonkiDog monkiDog = new MonkiDog();
//        Dog proxyMonki = (Dog)MyProxyFactory.getProxy(monkiDog);
        Dog proxyMonki = MyProxyFactory2.getProxy(monkiDog,Dog.class);
        proxyMonki.info("xxl");
        proxyMonki.run();
    }
}
