package Project;

public class Beverage extends Product {
    private String size;

    public Beverage(String name, double price, String size) {
        super(name, price); // Calls the constructor of the Product class
        this.size = size; // Sets the size
    }

    public void productInfo() { // Prints beverage information to the console
        System.out.println("Beverage Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
    }
}
