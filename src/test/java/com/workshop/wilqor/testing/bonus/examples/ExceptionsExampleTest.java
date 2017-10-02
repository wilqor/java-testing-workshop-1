package com.workshop.wilqor.testing.bonus.examples;

import org.junit.Test;

import java.io.IOException;

/**
 * Example demonstrating basic behavior of exceptions in JUnit
 * and serving as a base for discussing exception handling in tests.
 *
 * @author wilqor
 */
public class ExceptionsExampleTest {
    @Test
    public void uncheckedExceptionThrown() {
        // does not need to be caught, handled properly
        throw new NullPointerException();
        // does the test pass?
    }

    @Test
    public void checkedExceptionThrownAndCaught() {
        try {
            throw new IOException("Network connection timeout");
        } catch (IOException e) {
            System.err.println("Caught exception: " + e);
        }
        // does the test pass? was this behavior correct?
    }

    @Test
    public void checkedExceptionAddedToSignature() throws IOException {
        throw new IOException("Network connection timeout");
        // does the test pass?
    }

    @Test
    public void genericExceptionSignature() throws Exception {
        throw new CustomException("Custom exception with message");
        // what does it give us?
    }

    @Test(expected = CustomException.class)
    public void checkedExceptionExpected() throws Exception {
        throw new CustomException("Custom exception with message");
        // when should we use this method?
    }

    private static class CustomException extends Exception {
        CustomException(String message) {
            super(message);
        }
    }
}
