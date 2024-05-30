package com.pluralsight.classes;

import com.pluralsight.Interface.Ipay;

import java.util.Scanner;

public class Drink implements Ipay {
    private String name;
    private String size;
    private double price;

    public Drink(String name, String size) {
        this.name = "";
        this.size = size;
        this.price = 0;
    }

    public static Drink addDrink(){
        Scanner scan = new Scanner(System.in);
        System.out.println("what kind of drink you want? ");
        System.out.print("we have either coke or pepsi");

        String name = scan.nextLine().trim();
        System.out.println("what size drink");
        System.out.println("small- 2.00$ |medium- 2.50$ |large- 3.00$ ");
        String size = scan.nextLine();
        return new Drink(name, size);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void pay() {

    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public String getSize(String size) {
        switch (this.size.toLowerCase()){
            case "small":
                this.price = 2.0;
                break;
            case "medium":
                this.price = 2.5;
            case "large":
                this.price = 3.0;
                break;
            default:
                throw new IllegalArgumentException("wrong size");

        }
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
