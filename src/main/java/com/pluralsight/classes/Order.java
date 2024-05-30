package com.pluralsight.classes;

import java.util.List;

public class Order {
    private Customer customer;
    private Sandwich sandwich;
    private List<String> chips;
    private List<String> drink;

    public Order(Customer customer, Sandwich sandwich, List<String> chips, List<String> drink) {
        this.customer = customer;
        this.sandwich = sandwich;
        this.chips = chips;
        this.drink = drink;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<String> getChips() {
        return chips;
    }

    public void setChips(List<String> chips) {
        this.chips = chips;
    }

    public Sandwich getSandwich() {
        return sandwich;
    }

    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public List<String> getDrink() {
        return drink;
    }

    public void setDrink(List<String> drink) {
        this.drink = drink;
    }

    public static void addItem(Sandwich sandwich) {
    }
}

