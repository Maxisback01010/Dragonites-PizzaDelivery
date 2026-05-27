package com.pluralsight.Dragonitespizza;

import com.pluralsight.Dragonitespizza.enums.PizzaSize;
import com.pluralsight.Dragonitespizza.models.Pizza;

// Right now this is just placed to test my code to insure everything is running correctly
//Changes will be made in the future

public class Main {
    static void main(String[]args){
        Pizza pizza1 = new Pizza(
                "Pepperoni Pizza",
                16.50,
                PizzaSize.LARGE
        );

        System.out.println("Enjoy your Pizza!");



    }
}
