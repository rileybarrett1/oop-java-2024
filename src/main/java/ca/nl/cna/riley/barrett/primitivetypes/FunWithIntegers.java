package src.main.java.ca.nl.cna.riley.barrett.primitivetypes;

import java.util.Random;

public class FunWithIntegers {

    public static void main(String[] args) {
        System.out.println("Fun with integers");

        System.out.printf("\nLargest possible int: %d", Integer.MAX_VALUE);
        System.out.printf("\nSmallest possible int: %d", Integer.MIN_VALUE);

        Random random = new Random();

        System.out.printf("\nRandom value possible int:: %d", random.nextInt());
    }
}
