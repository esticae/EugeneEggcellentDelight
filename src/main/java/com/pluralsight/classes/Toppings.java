package com.pluralsight.classes;

abstract class Toppings {
    private String name;
    private double price;

    public Toppings(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String meats) {
        this.name = meats;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract void Top();
}
