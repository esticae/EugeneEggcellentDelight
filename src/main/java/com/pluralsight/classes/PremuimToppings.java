package com.pluralsight.classes;

public abstract class PremuimToppings extends Toppings {
    private String name;

    public PremuimToppings(String name) {
        super(name);
    }



    public abstract double getPrice(String size);
}
