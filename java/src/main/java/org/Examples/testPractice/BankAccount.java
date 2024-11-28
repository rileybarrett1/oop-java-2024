package org.Examples.testPractice;

public class BankAccount {
private int amount;

    public BankAccount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int deposit (int money){
        if (amount > 0){
            amount += money;
            System.out.println("deposited" + amount);
        }else {
            System.out.println("not completed");
        }
        return amount;
    }

    public int withdraw (int money){
        if (amount > 0){
            amount -= money;
            System.out.println("withdraw" + amount);
        }else {
            System.out.println("not completed");
        }
        return amount;
    }
}
