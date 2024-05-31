package com.pluralsight.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class HomeScreen {
    private static Scanner scan = new Scanner(System.in);
    private static Order currentOrder;

    public static void main(String[] args) {
        display();
    }

    public static void display() {
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

    private static void displayOptions() {
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

    public static void addSandwich() {
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

        System.out.println("please select your Toppings: ");
        System.out.println(" - lettuce \n - tomato \n - onion \n - pickles \n - jalapenos");
        String toppingsInput = scan.nextLine();
        String[] toppingsArray = toppingsInput.split(", ");
        List<Toppings> toppingsList = new ArrayList<>();
        for (String topping : toppingsArray) {
            toppingsList.add(new Toppings(topping) {
                @Override
                public double getPrice(String size) {
                    return 0;
                }
            });
        }

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
        Toppings meat = new Toppings(meatName) {
            @Override
            public double getPrice(String size) {
                return 0;
            }
        };
        toppingsList.add(meat);

        System.out.println("please select your Cheese: ");
        System.out.println(" - american \n - provolone \n - cheddar \n - swiss");
        String cheeseName = scan.nextLine();
        Toppings cheese = new Toppings(cheeseName) {
            @Override
            public double getPrice(String size) {
                return 0;
            }
        };
        toppingsList.add(cheese);

        System.out.println("please select your Sauces: ");
        System.out.println(" - mayo \n - mustard \n - ketchup");
        String saucesInput = scan.nextLine();
        String[] saucesArray = saucesInput.split(", ");
        List<String> saucesList = new ArrayList<>(Arrays.asList(saucesArray));

        System.out.println("Do you want your sandwich toasted? (yes/no)");
        String toastedInput = scan.nextLine();
        boolean isToasted = toastedInput.equalsIgnoreCase("yes");


        Sandwich sandwich = new Sandwich(size, bread, toppingsList, saucesList, isToasted);
        currentOrder.addItem(sandwich);    }

    public static void addDrink() {
        Scanner scan = new Scanner(System.in);
        System.out.println("what kind of drink you want? ");
        System.out.print("we have either coke or pepsi");

        String name = scan.nextLine().trim();
        System.out.println("what size drink");
        System.out.println("small- 2.00$ |medium- 2.50$ |large- 3.00$ ");
        String size = scan.nextLine();
        Drink drink = new Drink(name, size);
        ;
        currentOrder.addItem(drink);
    }

    public static void addChips() {
        Scanner scan = new Scanner(System.in);
        System.out.println("what kind of chips you want? ");
        System.out.print("we have either lays or pringles");

        String name = scan.nextLine().trim();
        System.out.println("what size chips");
        System.out.println("small- 1.50$ |medium- 2.00$ |large- 2.50$ ");
        String size = scan.nextLine();

        Chips chips = new Chips(name, size);
        currentOrder.addItem(chips);

    }

    private static void Cancel() {
    }

    private static void CheckOut() {
    }
}
















