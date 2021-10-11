package com.ual.javalab.jdkproxy;

public class SmsInterfaceImpl implements SmsInterface{

    @Override
    public String send(String message) {
        System.out.println(message);
        return message;
    }
}
