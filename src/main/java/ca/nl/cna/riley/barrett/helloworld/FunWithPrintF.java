package src.main.java.ca.nl.cna.riley.barrett.helloworld;

/**
 * A simple application to demonstrate how to use PrintF method - the most useful print funciton
 *
 * There are some good references in the Java API. Here's a list from the API v20 docs: https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/Formatter.html#syntax
 *
 * Note: printF will not change much at all!
 */
public class FunWithPrintF {

    public static void main(String[] args) {
        //printf with Strings
        System.out.printf("%s %s %s", "Fun", "with", "printf method");

        //printf with ints
        int x = 3;
        int y = 1024;
        System.out.printf("\nPrint ints: %d, %d\n", x, y);

        //TODO show an example with double and all primitive types

    }

}
