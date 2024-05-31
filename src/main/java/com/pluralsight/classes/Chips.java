package com.pluralsight.classes;

import com.pluralsight.Interface.Ipay;

import java.util.Scanner;

public class Chips implements Ipay {
    private String type;
    private double price;

    public Chips(String type, String price) {
        this.type = type;
        this.price = 1.50;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void pay() {
    }

    public double getPrice() {
        return price;
    }


}
