package com.ual.javalab.practice_makes_perfect.d5;

public enum InfoEnum implements InfoInterface{
    A("a"),
    B("b"){
        @Override
        public void info() {
            System.out.println("object B override info");
        }
    };

    String name;

    InfoEnum(){};
    InfoEnum(String name){
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("enum override info");
    }

    public static void main(String[] args) {
        InfoEnum.A.info();//enum override info
        InfoEnum.B.info();//object B override info
    }
}
