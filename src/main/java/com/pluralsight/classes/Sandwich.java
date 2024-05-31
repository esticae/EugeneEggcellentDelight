package com.pluralsight.classes;

import com.pluralsight.Interface.Ipay;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements Ipay {
    private String size;
    private String bread;
    private List<Toppings> Toppings;
    private List<String> sauces;
    private boolean Istoasted;


    public Sandwich(String size, String bread, List<Toppings> toppingsList, List<String> saucesList, boolean isToasted) {
        this.size = size;
        this.bread = bread;
        this.Toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.Istoasted = false;
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

    public List<com.pluralsight.classes.Toppings> getToppings() {
        return Toppings;
    }

    public void setToppings(List<com.pluralsight.classes.Toppings> toppings) {
        Toppings = toppings;
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

    @Override
    public void pay() {

    }

    @Override
    public double getPrice() {
        return 0;
    }
}



