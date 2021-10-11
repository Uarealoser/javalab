package com.ual.javalab.practice_makes_perfect.d9;

import sun.misc.Launcher;

import java.net.URL;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for(int i = 0 ;i< urLs.length;i++){
            System.out.println("url: "+urLs[i].toExternalForm());
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统类加载器:"+systemClassLoader);
        URL resource = systemClassLoader.getResource("");
        System.out.println("系统类加载器加载路径:"+resource);
        ClassLoader extensionClassLoader = systemClassLoader.getParent();
        System.out.println("扩展类加载器:"+extensionClassLoader);
        System.out.println("扩展类加载器加载路径:"+System.getProperty("java.ext.dirs"));
        ClassLoader rootClassLoader = extensionClassLoader.getParent();
        System.out.println("根类加载器:"+rootClassLoader);
    }
}
