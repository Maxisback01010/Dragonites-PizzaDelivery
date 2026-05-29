package com.pluralsight.Dragonitespizza.ui;

import com.pluralsight.Dragonitespizza.enums.PizzaSize;
import com.pluralsight.Dragonitespizza.models.Order;

import java.util.Scanner;


public class OrderScreen {

    private Scanner scanner;
    private Order order;
//Now Pizzas that are added in the OrderScreen stay stored in that order it becomes a scared object state
    // this makes easier communication
public OrderScreen(Order order){

    scanner = new Scanner(System.in);
    this.order = order;


}
 public void display(){

    boolean ordering = true;

    while(ordering){
        System.out.println("\n=== ORDER MENU=== ");
        System.out.println("1) Add Pizza");
        System.out.println("2) Checkout");
        System.out.println("0) Cancel Order");

        System.out.print("Choose an option: ");

        int choice = scanner .nextInt();

        switch (choice){


            case 1:

                System.out.println("\nChoose Pizza Size");
                System.out.println("1) Personal");
                System.out.println("2) Medium");
                System.out.println("3) Large");

                int sizeChoice = scanner.nextInt();

                // Variable declared BEFORE switch
                PizzaSize size;

                // Convert numeric input into enum value
                switch (sizeChoice) {

                    case 1:
                        size = PizzaSize.PERSONAL;
                        break;

                    case 2:
                        size = PizzaSize.MEDIUM;
                        break;

                    case 3:
                        size = PizzaSize.LARGE;
                        break;

                    default:
                        System.out.println("Invalid size.");
                        return;
                }

                // Pass selected size into method
                addPizza(size);

                break;

            case 2:
                System.out.println("Checkout selected.");
                break;

            case 0:
                ordering = false;
                System.out.println("Order canceled.");
                break;

            default:
                System.out.println("Invalid option.");

        }


    }

 }
  // Instead of putting a huge code into a switch statement I wanted to delegate responsibilties into methods
  // My methods should be handling how it happens not what happens
    private void addPizza(PizzaSize size) {
        System.out.println("Pizza added with size: " + size);






    }


}
