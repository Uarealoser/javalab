package com.ual.javalab.practicemakesperfect.d1;

public class InterfaceExtDImpl  implements InterfaceExtD{
    public static void main(String[] args) {
        InterfaceExtDImpl o = new InterfaceExtDImpl();
        o.idm(); // interface default method can be inherited
        InterfaceExtD.ism(); // interface static method can be invoke by Interface only
        System.out.println(InterfaceExtD.ipsf);// field in interface is public static final
    }

    @Override
    public void afun() {

    }
}
