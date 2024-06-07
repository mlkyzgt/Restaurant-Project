package Project;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant(); // Create a Restaurant object

		// Create meal objects
		Meal meal1 = new Meal("Margarita", 160, "Pizza");
		Meal meal2 = new Meal("Fettuccine", 115, "Pasta");
		Meal meal3 = new Meal("Risotto", 90, "Rice");
		// Add meals to the menu
		restaurant.addToMenu(meal1);
		restaurant.addToMenu(meal2);
		restaurant.addToMenu(meal3);

		// Create beverage objects
		Beverage beverage1 = new Beverage("Cola", 25, "Small");
		Beverage beverage2 = new Beverage("Cola", 45, "Large");
		Beverage beverage3 = new Beverage("Buttermilk", 20, "Small");
		// Add beverages to the menu
		restaurant.addToMenu(beverage1);
		restaurant.addToMenu(beverage2);
		restaurant.addToMenu(beverage3);

		// Create customer objects
		Customer customer1 = new Customer("Tuba");
		Customer customer2 = new Customer("Esin");
		Customer customer3 = new Customer("Ziya");
		// Add customers to the customers list
		restaurant.addCustomer(customer1);
		restaurant.addCustomer(customer2);
		restaurant.addCustomer(customer3);

		// Create waiter objects
		Waiter waiter1 = new Waiter("Ali");
		Waiter waiter2 = new Waiter("Ayse");
		Waiter waiter3 = new Waiter("Ahmet");
		// Add waiters to the waiters list
		restaurant.addWaiter(waiter1);
		restaurant.addWaiter(waiter2);
		restaurant.addWaiter(waiter3);

		restaurant.showMenu(); // Display the menu

		for (int i = 0; i < 10; i++) { // Generate 10 orders
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the option you want by typing the relevant number.");
			System.out.println("1: Only meal ");
			System.out.println("2: Only beverage ");
			System.out.println("3: Both meal and beverage");

			int choice = scan.nextInt(); // Get the user's choice
			System.out.println("");
			restaurant.createRandomOrder(choice); // Pass the selected number to the createRandomOrder method
			// For example, I created 10 orders, and they were saved as a txt file in the "Orders" folder.
			// You can delete the "Orders" folder and run the code again to generate new orders and print them.
		}
	}
}
