package com.pluralsight.Dragonitespizza;

import com.pluralsight.Dragonitespizza.enums.PizzaSize;
import com.pluralsight.Dragonitespizza.models.Pizza;
import com.pluralsight.Dragonitespizza.models.Order;

// Right now this is just placed to test my code to insure everything is running correctly
//Changes will be made in the future

public class Main {
    static void main(String[]args){

 // In this section I created an order and pizza object
 // Line 23 is where I added pizza into the order this is where the objects are interacting and working together
        Order order = new Order();

        Pizza pizza1 = new Pizza(
                "Pepperoni Pizza",
                16.50,
                PizzaSize.LARGE
        );

        order .addPizza(pizza1);

        System.out.println("Enjoy your Pizza!");



    }
}
