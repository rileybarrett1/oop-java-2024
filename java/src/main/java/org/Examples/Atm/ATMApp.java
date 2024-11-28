package org.Examples.Atm;

import java.util.Scanner;

/**
 * very simple atm app that asks the user for the pin
 * if the pin is wrong access denied
 */
public class ATMApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create ATM object with a predefined pin
        ATM atm = new ATM("1234");

        System.out.println("Welcome to the ATM!");
        System.out.print("Please enter your PIN: ");
        String enteredPin = scanner.nextLine();

        // Check if the entered pin is correct
        if (atm.checkPin(enteredPin)) {
            System.out.println("PIN verified successfully!");
            System.out.println("Access granted.");
        } else {
            System.out.println("Incorrect PIN. Access denied.");
        }

        scanner.close();
    }
}
