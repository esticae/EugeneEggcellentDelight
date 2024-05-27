package com.pluralsight.classes;

public class Drink implements Ipay{
    private int size;
    private String flavor;

    public Drink(int size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void pay() {

    }
}
