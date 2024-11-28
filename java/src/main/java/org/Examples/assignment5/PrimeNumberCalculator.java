package org.Examples.assignment5;

// PrimeNumberCalculator.java
public class PrimeNumberCalculator {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;      // Numbers less than or equal to 1 are not prime
        if (num == 2) return true;       // 2 is prime
        if (num % 2 == 0) return false;  // Even numbers greater than 2 are not prime

        for (int i = 3; i <= Math.sqrt(num); i += 2) {  // Check only odd divisors up to sqrt(num)
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to get the unique prime factorization of a number as a String
    public static String getUniquePrimeFactorization(int num) {
        if (num <= 1) return "No prime factorization for this number.";

        String factorization = "";
        int divisor = 2;

        while (num > 1) {
            if (num % divisor == 0) {
                if (!factorization.isEmpty()) {
                    factorization += "*";
                }
                factorization += divisor;
                num /= divisor;
            } else {
                divisor = divisor == 2 ? 3 : divisor + 2; // Skip even divisors after 2
            }
        }

        return factorization;
    }
}
