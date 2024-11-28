package org.Examples.TempratureConvertor;

public class TemperatureConverter {
    private double temperature;

    public TemperatureConverter(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double celsiusToFahrenheit() {
        return (temperature * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius() {
        return (temperature - 32) * 5 / 9;
    }
}
