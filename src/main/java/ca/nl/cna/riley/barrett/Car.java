package src.main.java.ca.nl.cna.riley.barrett;

/**
 * creating getter and setters to create a car object
 */

public class Car {

    private String make;
    private String model;
    private int year;
    private double value;

    public Car(String make, String model, int year, double value) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.value = value;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}


