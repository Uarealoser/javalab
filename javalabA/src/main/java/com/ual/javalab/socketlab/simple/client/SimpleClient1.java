package com.ual.javalab.socketlab.simple.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 1. 实现简单的客户端服务的Socket通信
 */
public class SimpleClient1 {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 8090);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("hello world".getBytes());
            outputStream.close();
            socket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
