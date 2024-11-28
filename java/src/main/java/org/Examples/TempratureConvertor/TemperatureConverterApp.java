package org.Examples.TempratureConvertor;

import java.util.Scanner;

public class TemperatureConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Converter!");

        // User input for temperature
        System.out.print("Enter temperature value: ");
        double tempValue = scanner.nextDouble();

        // Create TemperatureConverter object
        TemperatureConverter converter = new TemperatureConverter(tempValue);

        // Menu for conversion options
        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = scanner.nextInt();

        // Perform conversion based on user choice
        if (choice == 1) {
            System.out.println(tempValue + " Celsius = " + converter.celsiusToFahrenheit() + " Fahrenheit");
        } else if (choice == 2) {
            System.out.println(tempValue + " Fahrenheit = " + converter.fahrenheitToCelsius() + " Celsius");
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
