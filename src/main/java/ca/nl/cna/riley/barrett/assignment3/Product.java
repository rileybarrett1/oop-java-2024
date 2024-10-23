package src.main.java.ca.nl.cna.riley.barrett.assignment3;

public class Product {
    private int id;
    private String description;
    private double price;

    //Constructor
    public Product(int id, String description, double price) {
        if (id < 0) throw new IllegalArgumentException("Product ID cannot be negative.");
        if (price < 0) throw new IllegalArgumentException("Product price cannot be negative.");
        this.id = id;
        this.description = description;
        this.price = price;
    } // Getters

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    } // Setters

    public void setId(int id) {
        if (id < 0) throw new IllegalArgumentException("Product ID cannot be negative.");
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Product price cannot be negative.");
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [ID=" + id + ", Description=" + description + ", Price=" + price + "]";
    }
}
