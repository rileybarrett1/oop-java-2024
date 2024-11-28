package org.Examples.Counter;


/**
 * a counter class with an increment a determent
 */
public class Counter {
    private int count;


    /**
     * starts the counter at 0
     */
    public Counter() {
        this.count = 0;
    }


    /**
     * gets the count
     * @return count
     */
    public int getCount() {
        return count;
    }

    /**
     * method the increment the count
     */
    public void increment() {
        count++;
    }

    /**
     * method to decrement the count
     */
    public void decrement() {
        count--;
    }
}
