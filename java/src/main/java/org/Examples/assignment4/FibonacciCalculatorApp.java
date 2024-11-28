package org.Examples.assignment4;



import java.util.Scanner;

public class FibonacciCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FibonacciCalculator calculator = new FibonacciCalculator();

        while (true) {
            System.out.println("\nFibonacci Calculator Menu:");
            System.out.println("1. Display all Fibonacci numbers less than a given value");
            System.out.println("2. Display the first n Fibonacci numbers");
            System.out.println("3. Check if a number is a Fibonacci number");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the maximum value: ");
                int max = scanner.nextInt();
                System.out.print("Fibonacci numbers less than " + max + ": ");

                int a = 0, b = 1;
                while (a < max) {
                    System.out.print(a + " ");
                    int nextFib = a + b;
                    a = b;
                    b = nextFib;
                }
                System.out.println();

            } else if (choice == 2) {
                System.out.print("Enter the number of Fibonacci numbers to display: ");
                int n = scanner.nextInt();
                System.out.print("First " + n + " Fibonacci numbers: ");

                for (int i = 0; i < n; i++) {
                    FibonacciNumber fibNum = new FibonacciNumber(calculator.getFibonacciNumber(i));
                    System.out.print(fibNum.getValue() + " ");
                }
                System.out.println();

            } else if (choice == 3) {
                System.out.print("Enter the number to check: ");
                int number = scanner.nextInt();
                boolean isFib = calculator.isFibonacciNumber(number);
                System.out.println(number + (isFib ? " is" : " is not") + " a Fibonacci number.");

            } else if (choice == 4) {
                System.out.println("Exiting...");
                scanner.close();
                return;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}