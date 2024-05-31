package com.pluralsight.classes;


public class cheeses extends PremuimToppings {
    public cheeses(String name) {
        super(name);
    }

    @Override
    public double getPrice(String size) {
        return switch (size) {
            case "4" -> 0.75;
            case "8" -> 1.50;
            case "12" -> 2.25;
            default -> throw new IllegalArgumentException("Wrong size" + size);
        };
    }


}

