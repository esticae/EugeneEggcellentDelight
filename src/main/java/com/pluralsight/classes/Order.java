package com.pluralsight.classes;

public class Order {
    private Customer customer;
    private Sandwich sandwich;
    private Chips chips;
    private static Drink drink;




    public static void addItem(Drink drink) {
    }

    public static void addItem(Chips chips) {
    }


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Sandwich getSandwich() {
        return sandwich;
    }

    public void setSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    public Chips getChips() {
        return chips;
    }

    public void setChips(Chips chips) {
        this.chips = chips;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Order() {
        this.customer = customer;
        this.sandwich = sandwich;
        this.chips = chips;
        this.drink = drink;
    }



    public static Order addItem(Sandwich sandwich) {
        return null;
    }
}

