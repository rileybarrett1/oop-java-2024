package org.Examples.assignment5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for PrimeNumberCalculator
 */
class PrimeNumberCalculatorTest {

    /**
     * Test known prime numbers.
     */
    @Test
    void testKnownPrimes() {
        int[] knownPrimes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        for (int prime : knownPrimes) {
            assertTrue(PrimeNumberCalculator.isPrime(prime), prime + " should be prime.");
        }
    }

    /**
     * Test known non-prime numbers.
     */
    @Test
    void testNonPrimes() {
        int[] nonPrimes = {0, 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20};
        for (int nonPrime : nonPrimes) {
            assertFalse(PrimeNumberCalculator.isPrime(nonPrime), nonPrime + " should not be prime.");
        }
    }

    /**
     * Test unique prime factorization of a number.
     */
    @Test
    void testUniquePrimeFactorization() {
        assertEquals("2*2*3", PrimeNumberCalculator.getUniquePrimeFactorization(12), "Factorization of 12 should be 2*2*3");
        assertEquals("5*5", PrimeNumberCalculator.getUniquePrimeFactorization(25), "Factorization of 25 should be 5*5");
        assertEquals("No prime factorization for this number.", PrimeNumberCalculator.getUniquePrimeFactorization(0), "0 should not have a factorization.");
    }
}
