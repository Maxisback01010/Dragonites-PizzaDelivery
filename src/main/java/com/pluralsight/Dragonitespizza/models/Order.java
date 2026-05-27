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



}
