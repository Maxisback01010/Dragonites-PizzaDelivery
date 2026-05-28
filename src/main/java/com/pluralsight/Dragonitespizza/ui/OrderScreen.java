package com.pluralsight.Dragonitespizza.ui;

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
                System.out.println("Add pizza selected. ");
                break;

            case 2:
                System.out.println("Check out selected. ");
                break;

            case 0:
                ordering = false;
                System.out.println(" Order canceled. ");
                break;

            default:
                System.out.println("Invalid option. ");

        }


    }
 }

}
