package com.pluralsight.Dragonitespizza.models;

//Created pizza fields bc Pizza size will be different from drink size
//Pizza handles it's own size bc of separate concepts
import com.pluralsight.Dragonitespizza.enums.PizzaSize;

// Pizza will automatically inherit Price and Size
public class Pizza extends MenuItem {
    private PizzaSize size;
}
