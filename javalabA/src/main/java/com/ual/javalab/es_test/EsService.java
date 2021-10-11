package com.ual.javalab.es_test;


public class EsService {
    private String Name;
    private Integer Id;

    public EsService(){}
    public EsService(String name,Integer id){
        this.Name = name;
        this.Id = id;
    }

    public EsTest getEsTest(){
        return new EsTest(Name,Id);
    }
}
