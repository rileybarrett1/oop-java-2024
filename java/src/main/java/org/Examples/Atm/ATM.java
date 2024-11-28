package org.Examples.Atm;

/**
 * atm that initializes the pin
 * then returns the entered pin
 */
public class ATM {
    private String pin;

    public ATM(String pin) {
        this.pin = pin;
    }

    /**
     *returns the entered pin
     * @param enteredPin
     * @return enteredPin
     */
    public boolean checkPin(String enteredPin) {
        return pin.equals(enteredPin);
    }
}
