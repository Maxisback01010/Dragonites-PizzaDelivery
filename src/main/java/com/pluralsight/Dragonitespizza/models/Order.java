package com.pluralsight.Dragonitespizza.models;

// This allows us to use the ArrayList tool

import java.util.ArrayList;

public class Order {
 // Here I created an array list that knows that only pizza objects belong
 // This will help prevent mistakes

    private ArrayList<Pizza> pizzas;

// This is the  constructor what makes this important is w/o it the list does not exist

    public Order(){

        pizzas = new ArrayList();
    }
// Here is my method in this action my should be able to add pizzas
//This is how my order class manages it's own pizza, in other words encapsulation

    public void addPizza(Pizza pizza){
        pizzas.add(pizza);
    }

// In this section I created a for loop that is saying "for" every pizza in pizzas do something
// Basically take each pizza object from my pizza list one at a time

public void displayOrder(){

//I placed this loop here because order should manage and display not OrderScreen
    double total = 0;

        for(Pizza pizza : pizzas){

            total += pizza.getPrice();

            System.out.println(pizza);
        }
    System.out.println("\nOrder Total: $" + total);

}


}
