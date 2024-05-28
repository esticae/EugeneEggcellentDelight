package com.pluralsight.classes;

import com.pluralsight.Interface.Ipay;

public class Chips implements Ipay {
    private double price;

    public Chips(int price) {
        this.price = 1.50;
    }

    public Chips(){
        System.out.println("A side of chips is 1.50? is that ok?");


    }

    @Override
    public void pay() {

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
