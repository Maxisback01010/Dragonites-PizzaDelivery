# Dragonites Pizza Delivery

## Project Description

Dragonites Pizza Delivery is a console based pizza ordering application made in Java. The idea behind this project was to make a fun pizza ordering system inspired by games and pizza apps like Good Pizza Great Pizza, Pokémon Café, and Domino's.

The customer can build their own pizza by choosing a size, crust, sauce, and toppings. They can also add drinks and garlic knots to their order. Once checkout is complete, the application automatically saves a receipt file with a timestamp inside a receipts folder.

This project focuses heavily on object oriented programming concepts like inheritance, polymorphism, enums, loops, switch statements, collections, and file handling.

## What the Application Can Do

The application allows the user to:

Create custom pizzas

Choose pizza size

Choose crust type

Choose sauce type

Add multiple toppings

Add drinks

Add garlic knots

Calculate pricing automatically

Display order totals

Save receipts automatically with timestamps

## Project Structure

### MenuItem.java

This is the parent class for the menu system. It stores shared information like the item name and price. Pizza, Drink, and GarlicKnots all inherit from this class.

### Pizza.java

This class handles everything related to pizza creation. It stores pizza size, crust type, sauce type, toppings, and pricing logic.

### Drink.java

This class represents drinks in the application. It inherits from MenuItem.

### GarlicKnots.java

This class represents garlic knots in the application. It also inherits from MenuItem.

### Order.java

This class stores all menu items inside the order. It handles order totals and receipt formatting.

### OrderScreen.java

This is the main user interface of the application. It handles menu navigation, user input, pizza building, and checkout flow.

### ReceiptService.java

This class handles saving receipts to text files. It creates receipt folders and timestamp based receipt filenames automatically.

## Concepts Used

This project uses:

Object Oriented Programming

Inheritance

Polymorphism

Enums

ArrayLists

Loops

Switch Statements

File Writing

Exception Handling

Date and Time Formatting

## Challenges I Faced

One of the biggest challenges during this project was learning how inheritance works between parent and child classes. Another challenge was organizing the order flow while keeping the code readable and not overcomplicated.

I also learned how important object responsibility is. For example, the Order class handles the order data while the ReceiptService handles saving receipts.

## What I Learned

This project helped me better understand how larger Java applications are structured. I learned how classes communicate with each other and how inheritance can reduce duplicate code.

I also became more comfortable with debugging, file handling, and building applications step by step instead of trying to build everything at once.

## Future Improvements

In the future I would like to add:

Better menu navigation

A back button system

Half and half pizzas

A graphical user interface

More menu items

Customer accounts and saved orders


Screenshots of the application are included below.
