package com.pluralsight.classes;

import com.pluralsight.Interface.Ipay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sandwich implements Ipay {
    private String size;
    private String bread;
    private List<Toppings> Toppings;
    private List<String> sauces;
    private boolean Istoasted;


    public Sandwich(String size, String bread) {
        this.size = size;
        this.bread = bread;
        this.Toppings = new ArrayList<>();
        this.sauces = new ArrayList<>();
        this.Istoasted = false;
    }




    public void addSandwich() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome To EED");
        System.out.println("What bread do you want your sandwich: ");
        System.out.println(
                " - white \n" +
                        " - wheat \n" +
                        " - rye \n" +
                        " - wrap");
        String bread = scan.nextLine();
        System.out.println("What size do you want your sandwich?");
        System.out.println("4\" for 5.50$| 8\" for 7.00$| 12\" for 8.50$| ");
        String size = scan.next();

        System.out.println("please select your Meat: ");
        System.out.println(
                """
                         - ham\s
                         - steak
                         - salami\s
                         - roast beef\s
                         - chicken\s
                         - bacon \
                        """);
        String meatName = scan.nextLine();

        Meat meat = new Meat(meatName);

        System.out.println("please select your Cheese: ");
        System.out.println(" - american \n - provolone \n - cheddar \n - swiss");
        String cheeses = scan.nextLine();


        Toppings.add(meat);
        Toppings.add(cheeses);

        System.out.println("Do you want your sandwich toasted? (yes/no)");
        String toastInput = scan.next();
        boolean isToasted;
        isToasted = toastInput.equalsIgnoreCase("yes");








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

    public List<String> getToppings() {
        return Toppings;
    }

    public void setToppings(List<String> Toppings) {
        this.Toppings = Toppings;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void pay() {

    }
}
