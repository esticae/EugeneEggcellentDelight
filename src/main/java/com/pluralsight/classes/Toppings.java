package com.pluralsight.classes;

abstract class Toppings {
    private String meats;
    private int size;
    private double price;

    public Toppings(String meats, int size, double price) {
        this.meats = meats;
        this.size = size;
        this.price = price;
    }

    public String getMeats() {
        return meats;
    }

    public void setMeats(String meats) {
        this.meats = meats;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract void Top();
}
