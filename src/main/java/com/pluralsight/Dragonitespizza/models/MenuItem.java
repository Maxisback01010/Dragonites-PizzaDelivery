package com.pluralsight.Dragonitespizza.models;

// Menu is the Abstract, shared between pizza, drinks, and garlic knots
// Parent class and child classes will, traits price & size

public class MenuItem {
    protected String name;
    protected double price;

//I chose to add getPrice method in menu because it holds all menu items and pizza inherits from it
    //This is where price would belong
public MenuItem(String name, double price) {

    this.name = name;
    this.price = price;
}
    public String getName() {

        return name;
    }
    public double getPrice() {

        return price;
    }


}


