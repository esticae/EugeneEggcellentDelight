package com.pluralsight.classes;


public class cheeses extends PremuimToppings {
    private String size;


    public cheeses(String name, double price, String size) {
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
            case "4" -> 0.75;
            case "8" -> 1.50;
            case "12" -> 2.25;
            default -> throw new IllegalArgumentException("Wrong size" + size);
        };
    }

    public static cheeses createCheese(String name, double price, String size) {
        return new cheeses(name, price, size);
    }
}

