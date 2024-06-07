package Project;

public class Customer extends Person {
    public Customer(String name) {
        super(name); // Calls the constructor of the Person class
    }

    public Order placeOrder(Meal meal, Beverage beverage) { // Method used for the customer to place an order
        Order order = new Order(meal, beverage, null, this, null); // Creates a new order. Waiter and date information are left blank. Customer's name is passed as a parameter using 'this'
        return order; // Returns the order
    }
}
