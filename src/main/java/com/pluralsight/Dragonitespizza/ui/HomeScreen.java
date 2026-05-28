package com.pluralsight.Dragonitespizza.ui;

//In the HomeScreen class I have made it so owns its own menu, loop, and scanner


import java.util.Scanner;

public class HomeScreen {
    private Scanner scanner;

    public HomeScreen(){

        scanner = new Scanner(System.in);
    }
    public void display(){
// Here I chose to add a boolean because it states is this app on?
// Then it continues with while this statement is true display the menu options
//** Now going into switch and cases we did not really go over it this is something I learned on my own**
        boolean running = true;

        while (running){
            System.out.println("===Dragonites Pizza Delivery===");
            System.out.println("1) New Order");
            System.out.println("0) Exit");
            System.out.print("Choose an Option ");

            int choice = scanner .nextInt();
// I chose to use the switch and case  statement because it made my overall design neater
            //than having a ton of if than statements
            //in this case my numbers a fixed numbers so they didn't need a range if it was more of a range
            // I would have chosen an if than statement
            switch (choice){

                case 1:
                    System.out.println("Starting new order...");
                    break;
                case 0:
                    System.out.println("Goodbye!");

                default:
                    System.out.println("Invalid option.");


            }
        }

    }

}
