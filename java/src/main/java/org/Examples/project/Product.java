package org.Examples.project;

public class Product extends Billable{
    public Product(int id, String description, double price) {
        super(id, description, price);
    }

    @Override
    public String getBillingDetails() {
        return String.format("Product: %s (ID: %d, Price: $%.2f",getDescription(),getId(),getPrice());
    }
}
