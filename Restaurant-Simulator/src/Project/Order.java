package Project;

import java.io.PrintWriter;
import java.util.Date;

public class Order {
	private Meal meal;
	private Beverage beverage;
	public Waiter waiter;
	private Customer customer;
	public Date date;
	public static long orderNo;

	// Constructor to create an order
	public Order(Meal meal, Beverage beverage, Waiter waiter, Customer customer, Date date) {
		this.meal = meal;
		this.beverage = beverage;
		this.waiter = waiter;
		this.customer = customer;
		this.date = date;
	}
	
	// Prints order details to the console
	public void orderInfo() {
		System.out.println("Order Details:");
		// Checks whether only a meal, only a beverage, or both meal and beverage are selected.
		if(meal != null) { 
			System.out.println("Meal: " + meal.getName() + " - " + meal.getPrice() + " TL");
		}
		
		if(beverage != null) {
			System.out.println("Beverage: " + beverage.getName() + " - " + beverage.getPrice() + " TL");
		}
		System.out.println("Waiter: " + waiter.getName());
		System.out.println("Customer: " + customer.getName());
		System.out.println("Date: " + date);
		System.out.println("Order received. \n");
	}

	// Prints order details to a file
	public void printOrder(PrintWriter writer) {
		writer.println("Order Details: ");
		// Checks whether only a meal, only a beverage, or both meal and beverage are selected.
		if(meal != null) {
			writer.println("Meal: " + meal.getName() + " - " + meal.getPrice() + " TL");
		}
		
		if(beverage != null) {
			writer.println("Beverage: " + beverage.getName() + " - " + beverage.getPrice() + " TL");
		}
	
		writer.println("Waiter: " + waiter.getName());
		writer.println("Customer: " + customer.getName());
		writer.println("Date: " + date + "\n\n");
	}
}
