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
    public double getPrice() {
        switch (size){
            case "4":
                return 1.00;
            case "8":
                return 2.00;
            case "12":
                return 3.00;
            default:
                return 0.0;
        }

    }

}
