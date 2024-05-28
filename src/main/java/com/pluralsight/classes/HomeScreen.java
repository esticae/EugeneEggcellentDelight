package com.pluralsight.classes;

import java.util.Scanner;

public class HomeScreen {
    Scanner scan = new Scanner(System.in);

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
                        new Drink();
                        break;
                    case 3:
                        new Chips();
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

    private void addSandwich() {

    }


    private void Cancel() {
    }

    private void CheckOut() {
    }
}







