package com.ual.javalab.es_test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class EsPlugin {
    private static ConcurrentHashMap<Integer,EsService> esServiceMap= new ConcurrentHashMap<>();
    private static ConcurrentHashMap<Integer,EsTest> esTestMap= new ConcurrentHashMap<>();

    public static synchronized EsTest getEsTest(Integer id){
        EsTest esTest = esTestMap.get(id);
        if (esTest == null){
                if (esTestMap.get(id)==null){
                    EsService esService = esServiceMap.get(id);
                    if (esService == null){
                        esService = new EsService("service",id);
                        esServiceMap.put(id,esService);
                    }
                    EsTest et = esService.getEsTest();
                    esTestMap.put(id,et);
                    System.out.println("初始化，id "+id+" "+et);
                    return et;
                }
        }
        System.out.println("get，id "+id+" "+esTest);
        return esTest;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i =0;i<50;i++){
            new Thread(()->{
                EsPlugin.getEsTest(1);
                EsPlugin.getEsTest(2);
            }).start();
        }
        TimeUnit.SECONDS.sleep(10);
    }
}
