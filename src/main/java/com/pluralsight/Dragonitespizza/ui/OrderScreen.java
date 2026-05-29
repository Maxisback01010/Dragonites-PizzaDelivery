package com.pluralsight.Dragonitespizza.ui;

import com.pluralsight.Dragonitespizza.enums.PizzaSize;
import com.pluralsight.Dragonitespizza.enums.SauceType;
import com.pluralsight.Dragonitespizza.enums.Topping;
import com.pluralsight.Dragonitespizza.models.Order;
import com.pluralsight.Dragonitespizza.enums.CrustType;
import com.pluralsight.Dragonitespizza.models.Pizza;


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

                order.displayOrder();

                System.out.println(" Pikachu says: Thank you for your order!");

                ordering = false;

                break;

            case 0:
                ordering = false;
                System.out.println(" Metagross canceled your order.");
                break;

            default:
                System.out.println(" Porygon says: Invalid option.");



        }



    }

 }
  // Instead of putting a huge code into a switch statement I wanted to delegate responsibilties into methods
  // My methods should be handling how it happens not what happens

    private void addPizza(PizzaSize size) {

    //At this point the application is running and it gathering information at the same time

        System.out.println("\nChoose Crust:");
        System.out.println("1) Thin");
        System.out.println("2) Regular");
        System.out.println("3) Thick");
        System.out.println("4) Cauliflower");

        int crustChoice = scanner.nextInt();

        System.out.println("Pizza added with size: " + size);

        CrustType crustType;

        switch (crustChoice) {

            //This is just garunteed that the crust type is what it is. This does not give an option for "maybe" crust

            case 1:
                crustType = CrustType.THIN;
                break;

            case 2:
                crustType = CrustType.REGULAR;
                break;

            case 3:
                crustType = CrustType.THICK;
                break;

            case 4:
                crustType = CrustType.CAULIFLOWER;
                break;
//Here we did the default because if the user types a random input the app does not break
//return in this is very important as well bc if there is any invalid input the app stops immediately instead of continuing


            default:
                System.out.println("Invalid crust.");
                return;

        }


            System.out.println("\nChoose Sauce:");
            System.out.println("1) Tomato");
            System.out.println("2) Alfredo");
            System.out.println("3) BBQ");
            System.out.println("4) Pesto");

            int sauceChoice = scanner.nextInt();

            SauceType sauceType;

            switch (sauceChoice) {

                case 1:
                    sauceType = SauceType.TOMATO;
                    break;

                case 2:
                    sauceType = SauceType.ALFREDO;
                    break;

                case 3:
                    sauceType = SauceType.BBQ;
                    break;

                case 4:
                    sauceType = SauceType.PESTO;
                    break;

                default:
                    System.out.println("Invalid sauce.");
                    return;



        }

        Pizza pizza = new Pizza(
                "Custom Pizza",
                0,
                size,
                crustType,
                sauceType
        );

        System.out.println("\nChoose Toppings:");
        System.out.println("1) Pepperoni");
        System.out.println("2) Sausage");
        System.out.println("3) Bacon");
        System.out.println("4) Ham");
        System.out.println("5) Mushrooms");
        System.out.println("6) Onions");
        System.out.println("7) Olives");
        System.out.println("8) Peppers");
        System.out.println("9) Extra Cheese");
        System.out.println("0) Done Adding Toppings");


        boolean addingToppings = true;

        while (addingToppings) {

            System.out.print("Choose topping: ");

            int toppingChoice = scanner.nextInt();

            switch (toppingChoice) {

                case 1:
                    pizza.addTopping(Topping.PEPPERONI);
                    break;

                case 2:
                    pizza.addTopping(Topping.SAUSAGE);
                    break;

                case 3:
                    pizza.addTopping(Topping.BACON);
                    break;

                case 4:
                    pizza.addTopping(Topping.HAM);
                    break;

                case 5:
                    pizza.addTopping(Topping.MUSHROOMS);
                    break;

                case 6:
                    pizza.addTopping(Topping.ONIONS);
                    break;

                case 7:
                    pizza.addTopping(Topping.OLIVES);
                    break;

                case 8:
                    pizza.addTopping(Topping.PEPPERS);
                    break;

                case 9:
                    pizza.addTopping(Topping.EXTRA_CHEESE);
                    break;

                case 0:
                    addingToppings = false;
                    break;

                default:
                    System.out.println("Invalid topping.");
            }
        }


        pizza.calculatePrice();

        order.addItem(pizza);

        System.out.println(" Pika Pizza added!");



    }



}
