package com.ual.javalab.practicemakesperfect.d10;

import java.net.URL;
import java.net.URLClassLoader;
import java.sql.Connection;
import java.sql.Driver;
import java.util.Properties;

public class ClassLoaderDemo {
    private static Connection conn;

    public static Connection getConn(String url,String user,String pass)throws Exception{
        if (conn == null){
            // 创建一个URL数组
            URL[] urls = new URL[]{new URL("file:mysql-connector-java-3.1.10-bin.jar")};
            // 创建URLClassLoader对象
            URLClassLoader urlClassLoader = new URLClassLoader(urls);
            // 加载Mysql 的JDBC 驱动，并创建默认实例
            Driver driver = (Driver)urlClassLoader.loadClass("com.mysql.jdbc.Driver").newInstance();
            Properties properties = new Properties();
            properties.setProperty("user",user);
            properties.setProperty("password",pass);
            conn = driver.connect(url,properties);
        }
        return conn;
    }
}
