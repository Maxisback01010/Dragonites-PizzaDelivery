package com.pluralsight.Dragonitespizza;

import com.pluralsight.Dragonitespizza.enums.PizzaSize;
import com.pluralsight.Dragonitespizza.models.Pizza;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
