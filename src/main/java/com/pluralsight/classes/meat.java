package com.pluralsight.classes;

import java.util.List;

public class meat extends PremuimToppings {
    private String size;

    public meat(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
