package com.pluralsight.Dragonitespizza;

import com.pluralsight.Dragonitespizza.ui.HomeScreen;

public class Main {

 //At this point in my code I have made it so that things are deligated
    //there are different functions for classes, methods, and responsibilities

    public static void main(String[] args) {
//We orginally had main as a testing zone that created pizzas. It no longer does that
// this creates the UI controller
        HomeScreen homeScreen = new HomeScreen();
//This is hands controller to homescreen class
 //Main is letting HomeScreen know to handle user interactions
        homeScreen.display();
    }
}

// **Right now this is just placed to test my code to insure everything is running correctly**
//**Changes will be made in the future**

