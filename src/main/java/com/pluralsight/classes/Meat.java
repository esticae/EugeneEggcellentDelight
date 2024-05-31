package com.pluralsight.classes;

public class Meat extends PremuimToppings {
    public Meat(String name) {
        super(name);
    }

    @Override
    public double getPrice(String size) {
        return switch (size) {
            case "4" -> 1.00;
            case "8" -> 2.00;
            case "12" -> 3.00;
            default -> 0.0;
        };

    }

}
