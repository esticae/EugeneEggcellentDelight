package com.pluralsight.classes;

import java.util.Scanner;


public class HomeScreen {
    Scanner scan = new Scanner(System.in);
    private static Order currentOrder;

    public static void main(String[] args) {

    }

    public void display() {
        boolean running = true;
        while (running) {
            System.out.println("Welcome to the Deli");
            System.out.println("--------------------");
            System.out.println("1) New order");
            System.out.println("2) Exit");

            int input = scan.nextInt();

            switch (input) {
                case 1:
                    System.out.println("1) New order");
                    displayOptions();
                    break;
                case 2:
                    System.out.println("Goodbye");
                    running = false;
                    break;
                default:
                    System.out.println("Error go back");
            }
        }


    }

    private void displayOptions() {
        System.out.println("Chose an option");
        System.out.println("----------------");
        System.out.println("1) Add Sandwich ");
        System.out.println("2) Add Drink ");
        System.out.println("3) Add Chips ");
        System.out.println("4) Check out ");
        System.out.println("0) Cancel Order ");

        System.out.println("Choose an option");
        int input1 = scan.nextInt();


        switch (input1) {
            case 1:
                addSandwich();
                break;
            case 2:
                addDrink();
                break;
            case 3:
                addChips();
                break;
            case 4:
                CheckOut();
                break;
            case 0:
                Cancel();
            default:
                System.out.println("Try again");


        }
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
        System.out.println("4 for 5.50$| 8 for 7.00$| 12 for 8.50$| ");
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

        System.out.println("Please select your size: ");
        System.out.println("1) 4\"");
        System.out.println("2) 8\"");
        System.out.println("3) 12\"");

        int sizeInput = scan.nextInt();
        scan.nextLine();

        switch (sizeInput) {
            case 1:
                size = "4\"";
                break;
            case 2:
                size = "8\"";
                break;
            case 3:
                size = "12\"";
                break;
            default:
                System.out.println("Error: Invalid size option.");
                return;

        }

        Sandwich sandwich = new Sandwich(bread, size);
        Order.addItem(sandwich);


    }


    private void Cancel() {
    }

    private void CheckOut() {
    }
}










