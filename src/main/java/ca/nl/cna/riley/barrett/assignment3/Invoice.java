package src.main.java.ca.nl.cna.riley.barrett.assignment3;

public class Invoice {
    private InvoiceItem invoiceItem; // Constructor

    public Invoice(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    }

    // Getter
    public InvoiceItem getInvoiceItem() {
        return invoiceItem;
    }

    // Setter
    public void setInvoiceItem(InvoiceItem invoiceItem) {
        this.invoiceItem = invoiceItem;
    } // Method to get the total invoice amount

    public double getInvoiceTotal() {
        return invoiceItem.getItemTotal();
    }

    @Override
    public String toString() {
        return "Invoice [InvoiceItem=" + invoiceItem + ", Total=" + getInvoiceTotal() + "]";
    }
}