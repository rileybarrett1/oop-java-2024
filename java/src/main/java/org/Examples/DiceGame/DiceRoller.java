package org.Examples.DiceGame;

import java.util.Scanner;


/**
 * a class for the dice roller which displays a welcome message
 * while prompting the user to roll, once rolled it will display
 * what you rolled and ask if you want to roll again
 */
public class DiceRoller {
    public static void main(String[] args) {
        // Create a Dice object
        Dice dice = new Dice();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to the Dice Roller!");

        int rollAgain = 1;
        while (rollAgain == 1) {
            // Roll the dice and get the face value
            int diceRoll = dice.roll();

            // Display the result of the dice roll
            System.out.println("You rolled a " + diceRoll);

            // Ask if the user wants to roll again
            System.out.print("Would you like to roll again? (1 for yes, 0 for no): ");
            rollAgain = scanner.nextInt();
        }

        // Thank the user for playing
        System.out.println("Thanks for playing!");

        // Close the scanner
        scanner.close();
    }
}
