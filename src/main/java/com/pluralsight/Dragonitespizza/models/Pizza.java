package com.pluralsight.Dragonitespizza.models;

//Created pizza fields bc Pizza size will be different from drink size
//Pizza handles it's own size bc of separate concepts

import com.pluralsight.Dragonitespizza.enums.PizzaSize;

// Pizza will automatically inherit Price and Size

public class Pizza extends MenuItem {
    private PizzaSize size;

// This is storing the incoming value into this object field
// This is how inheritance works it's grabbing the variables from Menu to Pizza

    public Pizza(String name, double price, PizzaSize size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

// Here I added a tostring that is saying that when printing display it like so
// In this case I have it displaying my order size, the name of the pizza, and how much the pizzacost

        @Override
        public String toString() {
            return size + " " + name + " - $" + String.format("%.2f", price);
        }


}
