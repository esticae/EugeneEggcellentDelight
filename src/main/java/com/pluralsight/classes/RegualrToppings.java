package com.pluralsight.classes;

import java.util.ArrayList;
import java.util.List;

public class RegualrToppings extends Toppings {
    public RegualrToppings(String name) {
        super(name);
    }

    @Override
    public double getPrice(String size) {
        return 0;
    }
}




