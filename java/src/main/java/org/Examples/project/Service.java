package org.Examples.project;

public class Service extends Billable {
    private int hours;
    private double ratePerHour;
    public Service(int id, String description, int hours,double ratePerHour) {
        super(id, description, hours * ratePerHour);
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String getBillingDetails() {
        return String.format("service: %s (id: %d hours:%d Rate/hour: $%2f", getDescription(), getId(), hours, ratePerHour);
    }
}
