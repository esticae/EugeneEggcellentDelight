package com.pluralsight.classes;

import com.pluralsight.Interface.Ipay;

import java.util.Scanner;

public class Chips implements Ipay {
    private String type;
    private double price;

    public Chips(String type, double price) {
        this.type = type;
        this.price = 1.50;
    }

    public static Chips addChips() {
        Scanner scan = new Scanner(System.in);
        System.out.println("A side of chips is 1.50? is that ok?");
        System.out.println("We have crispy or potato");
        String type = scan.nextLine();
        double price = 1.50;
        return new Chips(type,price);

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
