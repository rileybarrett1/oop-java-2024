package org.Examples.testPractice;


import org.Examples.BankAccount.BankAccount;

import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(1000);
        System.out.println("welcome to the bank");
        System.out.println("your balance is " + account.getBalance());
        int choice = 0;

        while (choice != 3) {
            System.out.println("bank account:");
            System.out.println("1.Deposit money");
            System.out.println("2.Withdraw money");
            System.out.println("3.Exit");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter the amount you would like to deposit");
                double amount = sc.nextDouble();
                account.deposit(amount);
            } else if (choice == 2) {
                System.out.println("Enter the amount you would like to withdraw");
                double amount = sc.nextDouble();
                account.withdraw(amount);
            } else if (choice == 3) {
                System.out.println("Thank you for using our service");
                System.out.println("Final balance is " + account.getBalance());
            } else {
                System.out.println("Invalid option");
            }
        }
        sc.close();
    }
}
