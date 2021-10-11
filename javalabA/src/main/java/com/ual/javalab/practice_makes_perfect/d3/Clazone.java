package com.ual.javalab.practice_makes_perfect.d3;

public class Clazone extends Pizza{
    private final  boolean sauceInsize;

    public static class Builder extends Pizza.Builder<Builder>{
        private boolean sauceInsize;

        public Builder sauceInsize(){
            this.sauceInsize = true;
            return this;
        }

        @Override
        Clazone build() {
            return new Clazone(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    Clazone(Builder builder) {
        super(builder);
        this.sauceInsize = builder.sauceInsize;
    }

    @Override
    public String toString() {
        return "Clazone{" +
                "sauceInsize=" + sauceInsize +
                ", toppings=" + toppings +
                '}';
    }
}
