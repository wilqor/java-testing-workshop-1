package com.workshop.wilqor.testing.annotations.examples;

import com.workshop.wilqor.testing.StringLengthPrinter;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Example demonstrating usage of @Ignore annotation.
 *
 * @author wilqor
 */
public class IgnoreExampleTest {
    // System Under Test - the class to be tested
    private StringLengthPrinter sut;

    @Before
    public void setUp() {
        sut = new StringLengthPrinter();
    }

    // the description is optional
    @Ignore("ignored until null values are allowed")
    @Test
    public void testPrintingNull() {
        // this case will never be run in the scope of test suite
        sut.printInfo(null);
    }

    @Test
    public void testPrintingRegularString() {
        // this case will run and pass
        sut.printInfo("hello");
    }
}
