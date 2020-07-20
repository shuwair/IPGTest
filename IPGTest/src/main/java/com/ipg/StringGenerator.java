package com.ipg;

/**
 * Used Flyweight Pattern for generation unique string of 100 characters
 * String generated with the combination of  counter and zero padding
 */
public class StringGenerator {

    private int uniqueCount;

    StringGenerator() {
        uniqueCount = 0;
    }

    public String getNextUniqueString() {
        uniqueCount++;
        return String.format("%0100d", uniqueCount) + System.getProperty("line.separator");
    }
}
