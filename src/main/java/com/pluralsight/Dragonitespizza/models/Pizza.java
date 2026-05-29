package com.pluralsight.Dragonitespizza.models;

//Created pizza fields bc Pizza size will be different from drink size
//Pizza handles it's own size bc of separate concepts

import com.pluralsight.Dragonitespizza.enums.CrustType;
import com.pluralsight.Dragonitespizza.enums.PizzaSize;

//Each Pizza object stores more than one topping

import java.util.ArrayList;
import com.pluralsight.Dragonitespizza.enums.Topping;

import com.pluralsight.Dragonitespizza.enums.SauceType;


// Pizza will automatically inherit Price and Size

public class Pizza extends MenuItem {

    //I added an array list here bc customers might want multiple toppings or none at all

    private ArrayList<Topping> toppings = new ArrayList<>();

    private PizzaSize size;

    private SauceType sauceType;

// This is storing the incoming value into this object field
// This is how inheritance works it's grabbing the variables from Menu to Pizza
    //We added a new constructor "CrustType" to help grow the software for a more complete feel

    public Pizza(String name, double price, PizzaSize size,CrustType crustType,SauceType sauceType) {

        super(name, price);

        this.size = size;
        this.crustType = crustType;
        this.sauceType = sauceType;
    }

// Here I added a tostring that is saying that when printing display it like so
// In this case I have it displaying my order size, the name of the pizza, and how much the pizzacost
// Now I've updated the string to contain the crustType

        @Override
        public String toString() {
            return size + " " + sauceType + " " + crustType + " " + name +" | Toppings: " + toppings + " - $" + String.format("%.2f", price);
        }
    private CrustType crustType;

//This Method is saying to give it toppings and it will store it inside pizza

    public void addTopping(Topping topping) {

        toppings.add(topping);
    }
//I added this method in this class because since pizza handles its own size,toppings,sauce, crust
    //it should also handle its own price

    public void calculatePrice() {

//This is just the regular prices for the pizza's w/ no add on's

        switch (size) {

            case PERSONAL:
                price = 8.99;
                break;

            case MEDIUM:
                price = 12.99;
                break;

            case LARGE:
                price = 16.99;
                break;
        }
//This is just stating the topping cost

        price += toppings.size() * 1.50;
    }



}
