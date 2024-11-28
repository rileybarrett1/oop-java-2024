package org.Examples.assignment5;// PrimeNumberApp.java
import java.util.Scanner;

public class PrimeNumberApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nPrime Number Calculator Menu:");
            System.out.println("1. Display all prime numbers up to a specified value.");
            System.out.println("2. Display all prime numbers between two numbers.");
            System.out.println("3. Display the unique prime factorization of a specific number.");
            System.out.println("4. Display the unique prime factorizations of all numbers up to a specified value.");
            System.out.println("0. Exit.");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the upper limit: ");
                int upperLimit = scanner.nextInt();
                System.out.println("Prime numbers up to " + upperLimit + ":");

                for (int i = 2; i <= upperLimit; i++) {
                    if (PrimeNumberCalculator.isPrime(i)) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();

            } else if (choice == 2) {
                System.out.print("Enter the lower limit: ");
                int lowerLimit = scanner.nextInt();
                System.out.print("Enter the upper limit: ");
                int upperLimit = scanner.nextInt();
                System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + ":");

                for (int i = lowerLimit; i <= upperLimit; i++) {
                    if (PrimeNumberCalculator.isPrime(i)) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();

            } else if (choice == 3) {
                System.out.print("Enter a number to factorize: ");
                int num = scanner.nextInt();
                System.out.println("Prime factorization of " + num + ": " +
                        PrimeNumberCalculator.getUniquePrimeFactorization(num));

            } else if (choice == 4) {
                System.out.print("Enter the upper limit: ");
                int upperLimit = scanner.nextInt();
                System.out.println("Prime factorizations up to " + upperLimit + ":");
                for (int i = 2; i <= upperLimit; i++) {
                    System.out.println(i + " = " + PrimeNumberCalculator.getUniquePrimeFactorization(i));
                }

            } else if (choice == 0) {
                System.out.println("Exiting the program.");

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
