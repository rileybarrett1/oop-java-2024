package src.main.java.ca.nl.cna.riley.barrett.assignment3;

public class InvoiceItem {
    private Product product;
    private int quantity;

    // Constructor
    public InvoiceItem(Product product, int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative.");
        this.product = product;
        this.quantity = quantity;
    } // Getter

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    } // Setters

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) throw new IllegalArgumentException("Quantity cannot be negative.");
        this.quantity = quantity;
    } // Method to calculate total

    public double getItemTotal() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "InvoiceItem [Product=" + product + ", Quantity=" + quantity + ", Total=" + getItemTotal() + "]";
    }
}
