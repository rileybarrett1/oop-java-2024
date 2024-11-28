package org.Examples.BankAccount;

/**
 * bank account class with getters and setters
 * while checking if correct info is entered
 */
public class BankAccount {
    private double balance;

    /**
     * initializes the initial balance
     * @param initialBalance
     */
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * gets the balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * deposit method and checks if the deposit is
     * less than zero if so returns an error message
     * @param amount
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * method to withdraw money in your bank account
     * while checking if its more then the balance
     * or if iots less than zero
     * @param amount
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
