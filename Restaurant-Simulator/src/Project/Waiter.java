package Project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

public class Waiter extends Person {
    public Waiter(String name) {
        super(name); // Assigns the name of the waiter to 'name'
    }

    // Takes an order and prints it to a file
    public void takeOrder(Order o, ArrayList<Order> orders) {
        Date date = new Date(); // Gets the current date
    	o.waiter = this; // Adds the waiter's name to the order 'o'
    	o.date = date; // Adds the date information to the order 'o'
        orders.add(o);   // Adds the order to the list of orders
        
        try {
            File directory = new File("src/Project/Orders"); // Specifies where the file will be created
            directory.mkdir(); // Creates a folder for storing txt files
            String fileName = "Order_" + (Order.orderNo + 1) + ".txt"; // Creates the file name. Adding 1 to the order number to start from 1
            String filePath = "src/Project/Orders" + "/" + fileName; // Creates the full path of the file.
            PrintWriter writer = new PrintWriter(new FileWriter(filePath)); // Creates the file and writer
            o.printOrder(writer); // Prints the order 'o'.
            writer.close(); // Closes the writer
            Order.orderNo++; // Increments the order number for the next order
        }

        catch (IOException e) { // If the file is not found, an error message is sent
            System.err.println("File not found.");
        }
    }
}
