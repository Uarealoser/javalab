package com.ual.javalab.socketlab.simple.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1. 实现简单的客户端服务的Socket通信
 */
public class SimpleServer1 {
    public static void main(String[] args) {
        try {
            char[] ca = new char[3];
            ServerSocket serverSocket = new ServerSocket(8090);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            int len = inputStreamReader.read(ca);
            while (len!=-1){
                String s = new String(ca);
                System.out.println(s);
                len = inputStreamReader.read(ca);
            }
            inputStreamReader.close();
            inputStream.close();
            socket.close();
            serverSocket.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
