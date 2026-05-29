package com.pluralsight.Dragonitespizza.services;

import com.pluralsight.Dragonitespizza.models.Order;

//This is where folders and files are created
import java.io.File;

// Writes text into files

import java.io.FileWriter;

// Handles file writing errors
import java.io.IOException;

//Gets current time stamp


import java.time.LocalDateTime;

//Makes sure the layout is nice

import java.time.format.DateTimeFormatter;

public class Receipt {

    public void saveReceipt(Order order) {

        String timestamp = LocalDateTime.now()
                .format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss"));

        File folder = new File("receipts");

        if (!folder.exists()) {

            folder.mkdir();
        }
        String fileName = "receipts/receipt-" + timestamp + ".txt";

        try {

            FileWriter writer = new FileWriter(fileName);

            writer.write(order.toString());

            writer.close();

            System.out.println("Receipt saved: " + fileName);

        } catch (IOException e) {

            System.out.println("Error saving receipt.");
        }

    }
}

