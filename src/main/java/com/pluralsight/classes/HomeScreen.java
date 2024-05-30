package com.pluralsight.classes;

import java.util.Scanner;

import static com.pluralsight.classes.Chips.addChips;
import static com.pluralsight.classes.Drink.addDrink;
import static com.pluralsight.classes.Sandwich.addSandwich;

public class HomeScreen {
    Scanner scan = new Scanner(System.in);
    private java.util.Scanner Scanner;

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
            private void displayOptions()  {
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

    /*private void addSandwich() {
        boolean running = true;
        while (running){
            scan.nextLine();
            System.out.println("please select your Bread: ");
            System.out.println(
                    " - white \n" +
                    " - wheat \n" +
                    " - rye \n" +
                    " - wrap");
            int breadInput = scan.nextInt();
            String bread;
            switch (breadInput) {
                case 1:
                    bread = "White";
                    break;
                case 2:
                    bread = "Wheat";
                    break;
                case 3:
                    bread = "Rye";
                    break;
                case 4:
                    bread = "Wrap";
                    break;
                default:
                    System.out.println("Error: Invalid bread option.");
                    return;
            }

            System.out.println("Please select your size: ");
            System.out.println("1) 4\"");
            System.out.println("2) 8\"");
            System.out.println("3) 12\"");

            int sizeInput = scan.nextInt();
            scan.nextLine();
            String size = "";
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

            //Sandwich sandwich = new Sandwich(bread,size);
            //Order.addItem(sandwich);


        }



    }*/


    private void Cancel() {
    }

    private void CheckOut() {
    }
}







