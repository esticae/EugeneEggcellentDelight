package com.pluralsight.classes;

import com.pluralsight.Interface.Ipay;

import java.util.List;
import java.util.Scanner;

public class Sandwich implements Ipay {
    private String size;
    private String bread;
    private List<String> regulrToppings;
    private List<String> sauces;
    private boolean Istoasted;
    private double price;


    public Sandwich(String size, String bread, List<String> sauces, boolean istoasted, double price) {
        this.size = size;
        this.bread = bread;
        this.sauces = sauces;
        Istoasted = istoasted;
        this.price = price;
    }




    public static Sandwich addSandwich() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome To EED");
        System.out.println("What size do you want your sandwich?");
        System.out.println("4\" for 5.50$| 8\" for 7.00$| 12\" for 8.50$| ");
        String size = scan.next();
        double price = 0.0;
        switch (size) {
            case "4":
                price = 5.50;
                break;
            case "8":
                price = 7.00;
                break;
            case "12":
                price = 8.50;
                break;
            default:
                System.out.println("Errror wrong size");
                return null;


        }


    }

    public void setPrice(double price) {
        switch (size) {
            case "4":
                price = 5.50;
                break;
            case "8":
                price = 7.00;
                break;
            case "12":
                price = 8.50;
                break;
            default:
                throw new IllegalArgumentException("Invalid size");


        }
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public List<String> getSauces() {
        return sauces;
    }

    public void setSauces(List<String> sauces) {
        this.sauces = sauces;
    }

    public boolean isIstoasted() {
        return Istoasted;
    }

    public void setIstoasted(boolean istoasted) {
        Istoasted = istoasted;
    }



    public double getPrice() {
        return price;
    }

    @Override
    public void pay() {

    }
}
