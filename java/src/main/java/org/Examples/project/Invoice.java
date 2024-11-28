package org.Examples.project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<InvoiceItem> invoiceItems;
    private LocalDate date;
    private String paymentTerms;
    private String notes;
    private double salesTaxRate;

    public Invoice(Customer customer, LocalDate date, String paymentTerms, String notes, double salesTaxRate) {
        this.customer = customer;
        this.invoiceItems = new ArrayList<>();
        this.date = date;
        this.paymentTerms = paymentTerms;
        this.notes = notes;
        this.salesTaxRate = salesTaxRate;
    }
    public void addInvoiceItem(InvoiceItem invoiceItem) {
        invoiceItems.add(invoiceItem);
    }

    public double getInvoiceTotal(){
        return invoiceItems.stream().mapToDouble(InvoiceItem::getItemTotal).sum();

    }

    private double getInvoiceTotalWithTax(){
        return getInvoiceTotal() * (1 + salesTaxRate);
    }

    public List<InvoiceItem> getInvoiceItems() {
        return invoiceItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getDate(){
        return date;
    }

    public String getPaymentTerms(){
        return paymentTerms;
    }

    public String getNotes(){
        return notes;
    }
}
