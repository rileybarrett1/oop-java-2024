package org.Examples.project;

public class InvoiceItem {
    private Billable billable;
    private int quantity;

    public InvoiceItem(Billable billable, int quantity) {
        this.billable = billable;
        this.quantity = quantity;
    }

    public Billable getBillable() {
        return billable;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemTotal() {
        if(billable instanceof Product) {
            return billable.getPrice() * quantity;
        }else if (billable instanceof Service) {
            return billable.getPrice();
        }
        return 0;
    }
}
