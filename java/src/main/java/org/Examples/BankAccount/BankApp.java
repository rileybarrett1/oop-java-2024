package org.Examples.BankAccount;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create BankAccount object with an initial balance
        BankAccount account = new BankAccount(1000);  // Starting balance of 1000

        System.out.println("Welcome to the Bank!");
        System.out.println("Your current balance is: $" + account.getBalance());

        // Menu for deposit and withdrawal
        int choice = 0;
        while (choice != 3) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Exit");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double amount = scanner.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double amount = scanner.nextDouble();
                account.withdraw(amount);
            } else if (choice == 3) {
                System.out.println("Thank you for using our service!");
                System.out.println("Final balance: $" + account.getBalance());
            } else {
                System.out.println("Invalid option! Try again.");
            }
        }

        scanner.close();
    }
}
