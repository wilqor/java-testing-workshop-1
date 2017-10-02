package com.workshop.wilqor.testing;

/**
 * Trivial class serving as an example for ignored tests.
 *
 * @author wilqor
 */
public class StringLengthPrinter {
    /**
     * Prints information about provided string.
     *
     * @param str string to be printed
     */
    public void printInfo(String str) {
        System.out.println(String.format("'%s' is: %d characters long", str, str.length()));
    }
}
