package org.Examples.Counter;

import java.util.Scanner;


/**
 * counter app displays to the user to increment or decrement
 * depending on what they pick the number will go up or down
 */
public class CounterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Counter object
        Counter counter = new Counter();

        System.out.println("Welcome to the Counter!");

        int choice = 0;
        while (choice != 3) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Increment");
            System.out.println("2. Decrement");
            System.out.println("3. Exit");
            choice = scanner.nextInt();

            if (choice == 1) {
                counter.increment();
                System.out.println("Counter: " + counter.getCount());
            } else if (choice == 2) {
                counter.decrement();
                System.out.println("Counter: " + counter.getCount());
            } else if (choice == 3) {
                System.out.println("Final count: " + counter.getCount());
                System.out.println("Thank you for using the counter.");
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        scanner.close();
    }
}
