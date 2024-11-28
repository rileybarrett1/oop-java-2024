package org.Examples.DiceGame;

import java.util.Random;


/**
 * simple dice class with a getter and setter
 * for the face values and a roll that calculates
 */
public class Dice {
    private int faceValue;


    public Dice() {
        this.faceValue = roll();
    }

    /**
     *  a getter for the faceValue
     * @return faceValue
     */
    public int getFaceValue() {
        return faceValue;
    }


    /**
     * checking if the face value is less than 1 or higher
     * than 6 and if it is you get an error message
     * @param faceValue
     */
    public void setFaceValue(int faceValue) {
        if (faceValue >= 1 && faceValue <= 6) {
            this.faceValue = faceValue;
        } else {
            System.out.println("Invalid face value. It should be between 1 and 6.");
        }
    }

    /**
     * generates a random number between 1 and 6
     * @return faceValue
     */
    public int roll() {
        Random random = new Random();
        faceValue = random.nextInt(6) + 1;
        return faceValue;
    }
}
