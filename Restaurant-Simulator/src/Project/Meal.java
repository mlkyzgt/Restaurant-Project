package Project;

public class Meal extends Product {
    private String type;

    public Meal(String name, double price, String type) {
        super(name, price); // Calls the constructor of the Product class
        this.type = type; // Sets the type of the meal
    }

    public void productInfo() { // Prints meal information to the console
        System.out.println("Meal Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }
}
