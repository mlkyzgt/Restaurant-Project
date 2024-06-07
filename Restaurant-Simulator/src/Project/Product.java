package Project;

public abstract class Product {
	protected String name;
	protected double price;

	public Product(String name, double price) {
		this.name = name; // Assigns the name of the product
		this.price = price; // Assigns the price of the product
	}

	public String getName() {
		return name; // Returns the name of the product
	}

	public double getPrice() {
		return price; // Returns the price of the product
	}

	public abstract void productInfo(); // Abstract method that subclasses need to implement
}
