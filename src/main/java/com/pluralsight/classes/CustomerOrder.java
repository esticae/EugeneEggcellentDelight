package com.pluralsight.classes;

import java.util.Scanner;

public class CustomerOrder {
    Scanner scan = new Scanner(System.in);

    public void display() {
        boolean running = true;
        while (running){
            System.out.println("Welcome to the deli");
            System.out.println("____Chose an option____");
            System.out.println("1) Add Sandwich ");
            System.out.println("2) Add Drink ");
            System.out.println("3) Add Chips ");
            System.out.println("4) Check out ");
            System.out.println("0) Cancel Order ");

            System.out.println("Choose an option");
            int input = scan.nextInt();

            switch (input) {
                case 1:
                    new Sandwich();
                break;
                case 2:
                    new Drink();
                break;
                case 3:
                    new Chips();
                break;
                case 4: CheckOut;
                break;
                case 0: Cancel order;
                cancelOrder = true;
                default:
                    System.out.println("Try again");


            }



        }

    }
}
