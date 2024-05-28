package com.pluralsight.classes;

import com.pluralsight.Interface.Ipay;

import java.util.Scanner;

public class Drink implements Ipay {
    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = "";
        this.price = 0;
    }

    public Drink(){
        System.out.println("what kind of drink you want? ");
        System.out.print("We have either coke or pepsi");
        System.out.println();
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine().trim();
        System.out.println("whats the price");
        double price = scan.nextDouble();

        Drink drink = new Drink(name, price);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public void pay() {

    }
}
