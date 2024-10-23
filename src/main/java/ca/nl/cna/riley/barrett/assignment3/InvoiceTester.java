package src.main.java.ca.nl.cna.riley.barrett.assignment3;

public class InvoiceTester {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product(1, "Laptop", 1200.00);
        Product product2 = new Product(2, "Mouse", 25.50);
        Product product3 = new Product(3, "Keyboard", 45.00);
        // Print product details
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        // Try creating products with negative values (Should throw exceptions)
        try {
            Product negativePriceProduct = new Product(4, "Faulty Product", 100.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } // Create InvoiceItems
        InvoiceItem item1 = new InvoiceItem(product1, 2);
        InvoiceItem item2 = new InvoiceItem(product2, 3);
        InvoiceItem item3 = new InvoiceItem(product3, 1);
        // Print invoice items
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
        // Try creating invoice items with negative quantities (Should throw exceptions)
        try {
            InvoiceItem negativeQuantityItem = new InvoiceItem(product2, 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } // Create an Invoice
        Invoice invoice1 = new Invoice(item1);
        Invoice invoice2 = new Invoice(item2);
        // Print the invoice details
        System.out.println(invoice1);
        System.out.println(invoice2);
    }
}