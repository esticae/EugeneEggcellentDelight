package com.pluralsight.classes;

public abstract class PremuimToppings extends Toppings {
    private String name;
    private double price;

    public PremuimToppings(String name, double price) {
        super(name, price);
    }

    @Override
    void Top() {

    }

    public abstract double getPrice(String size);
}
