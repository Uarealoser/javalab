package com.ual.javalab.practicemakesperfect.d3;

public class D3 {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        Clazone clazone = new Clazone.Builder().addTopping(Pizza.Topping.HAM).sauceInsize().build();
        System.out.println(nyPizza+":"+clazone);
    }
}
