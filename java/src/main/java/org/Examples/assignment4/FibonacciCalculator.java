package org.Examples.assignment4;

public class FibonacciCalculator {

    /**
     * Method to check if a given number is a Fibonacci number
     */
    public boolean isFibonacciNumber(int number) {
        int a = 0, b = 1;
        while (b < number) {
            int nextFib = a + b;
            a = b;
            b = nextFib;
        }
        return b == number || number == 0;
    }

    /**
     * Method to calculate the nth Fibonacci number
     * @return Fibonacci number
     */
    public int getFibonacciNumber(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, fib = 1;
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}
