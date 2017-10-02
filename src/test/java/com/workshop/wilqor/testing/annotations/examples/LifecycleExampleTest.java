package com.workshop.wilqor.testing.annotations.examples;

import org.junit.*;

/**
 * Example demonstrating the order (or lack of order) in execution of
 * JUnit lifecycle methods.
 *
 * @author wilqor
 */
public class LifecycleExampleTest {
    // note that it is static!
    @BeforeClass
    public static void setUpClass() {
        // a place for costly setup
        System.out.println("Before class...");
    }

    @Before
    public void setUp() {
        // a place for setup
        System.out.println("Before...");
    }

    @Test
    public void firstTest() {
        System.out.println("1");
    }

    @Test
    public void secondTest() {
        System.out.println("2");
    }

    @Test
    public void thirdTest() {
        // what happens when we rename the method to "someTest"?
        System.out.println("3");
    }

    @After
    public void tearDown() {
        // a place for clean up if needed
        System.out.println("...after");
    }

    // this one is static too!
    @AfterClass
    public static void tearDownClass() {
        // a place for cleaning up resources in class context
        System.out.println("...after class");
    }
}
