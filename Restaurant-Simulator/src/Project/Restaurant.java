package Project;

import java.util.ArrayList;
import java.util.Random;

public class Restaurant {
    private ArrayList<Product> menu;
    private ArrayList<Order> orders;
    private ArrayList<Customer> customers;
    private ArrayList<Waiter> waiters;

    // Constructor initializes ArrayLists
    public Restaurant() {
         this.menu = new ArrayList<>();
         this.orders = new ArrayList<>();
         this.customers = new ArrayList<>();
         this.waiters = new ArrayList<>();
    }
    
    // Adds a new item to the menu
    public void addToMenu(Product product) {
        menu.add(product);
    }
    
    // Adds a new customer
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    // Adds a new waiter
    public void addWaiter(Waiter waiter) {
        waiters.add(waiter);
    }
    
    // Displays the menu
    public void showMenu() {
        System.out.println("----MENU----");
        for (Product product : menu) { // Determines whether the item is a meal or a beverage
            if (product instanceof Meal) {
                Meal meal = (Meal) product;
                meal.productInfo();
            } else if (product instanceof Beverage) {
                Beverage beverage = (Beverage) product;
                beverage.productInfo();
            }
            System.out.println("------------");
        }
    }

    public void createRandomOrder(int choice) {
            Random random = new Random();
            int menuIndex = random.nextInt(menu.size());
            Product selectedProduct = menu.get(menuIndex);
            Meal selectedMeal = null;
            Beverage selectedBeverage = null;
            
            // User selects whether they want only a meal, only a beverage, or both meal and beverage in the test class.
            if(choice == 1) { // If only a meal is selected, enter this condition.
                while(selectedMeal == null) { // Loop until a meal is selected
                    int newIndex = random.nextInt(menu.size());
                    selectedProduct = menu.get(newIndex);
                    if (selectedProduct instanceof Meal) {
                        selectedMeal = (Meal) selectedProduct;
                    }
                }
            }
            
            else if(choice == 2) { // If only a beverage is selected, enter this condition
                while(selectedBeverage == null) {// Loop until a beverage is selected
                    int newIndex = random.nextInt(menu.size());
                    selectedProduct = menu.get(newIndex);
                    if (selectedProduct instanceof Beverage) {
                        selectedBeverage = (Beverage) selectedProduct;
                    }
                }
            }
            
            else if(choice == 3) { // If both meal and beverage are selected, enter this condition
                while (selectedMeal == null || selectedBeverage == null) { // Loop until both items are selected
                    int newIndex = random.nextInt(menu.size());
                    selectedProduct = menu.get(newIndex);
                    if (selectedProduct instanceof Meal) {
                        selectedMeal = (Meal) selectedProduct;
                    } else if (selectedProduct instanceof Beverage) {
                        selectedBeverage = (Beverage) selectedProduct;
                    }
                }
            }
            
            // Random customer and waiter are selected
            int customerIndex = random.nextInt(customers.size());
            Customer selectedCustomer = customers.get(customerIndex);

            int waiterIndex = random.nextInt(waiters.size());
            Waiter selectedWaiter = waiters.get(waiterIndex);
            
            // Order is placed through the selected customer
            Order newOrder = selectedCustomer.placeOrder(selectedMeal, selectedBeverage);
            
            // Order is taken by the selected waiter
            selectedWaiter.takeOrder(newOrder, orders);

            // Order information is printed to the console
            newOrder.orderInfo();
        
    }
}
