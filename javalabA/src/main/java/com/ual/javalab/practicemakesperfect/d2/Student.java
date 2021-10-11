package com.ual.javalab.practicemakesperfect.d2;

/**
 * 建造者模式
 */
public class Student {
    private String name;
    private int studentId;
    private final String IDCARD;

    public static class Builder{
        private final String IDCARD;
        private String name;
        private int studentId;

        public Builder(String idCard){
            this.IDCARD = idCard;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder studentId(int studentId){
            this.studentId = studentId;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    public Student(Builder builder){
        this.IDCARD = builder.IDCARD;
        this.name = builder.name;
        this.studentId = builder.studentId;
    }

    public static void main(String[] args) {
        Student wzh = new Builder("4016").name("wzh").studentId(31614013).build();
        System.out.println("idcard:"+wzh.IDCARD+";name:"+wzh.name+";studentId:"+wzh.studentId);
    }
}
