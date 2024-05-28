package com.pluralsight.classes;

import java.util.ArrayList;
import java.util.List;

public class RegualrToppings extends Toppings {
    private List<String> toppings;

    public RegualrToppings(String meats, int size, double price) {
        super(meats, size, price);
    }

    public void NewToppings() {
        toppings = new ArrayList<>();
        toppings.add("Lettuce");
        toppings.add("Peppers");
        toppings.add("Onions");
        toppings.add("jalapenos");
        toppings.add("cucumbers");
        toppings.add("guacamole");
        toppings.add("mushrooms");
        toppings.add("pickles");
        toppings.add("tomatoes");

        System.out.println();
        for (String topping : toppings) {
            System.out.println(topping);
        }



    }


    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    void Top() {

    }
}

