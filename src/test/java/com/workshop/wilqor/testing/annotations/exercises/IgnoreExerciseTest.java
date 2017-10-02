package com.workshop.wilqor.testing.annotations.exercises;

import com.workshop.wilqor.testing.SearchEngine;
import org.junit.Before;
import org.junit.Test;

/**
 * Exercise objective: SUT is not working, so we need to ignore all
 * tests in the suite until it is fixed.
 * Tip 0: Try running all tests by right-clicking on package 'com.workshop.wilqor.testing.annotations.exercises' and Run 'Tests'...
 * Tip 1: Be lazy.
 *
 * @author wilqor
 */
public class IgnoreExerciseTest {
    private SearchEngine sut;

    @Before
    public void setUp() {
        sut = new SearchEngine();
    }

    @Test
    public void testSearchingForPurpose() {
        String answer = sut.search("Why are we here?");
        System.out.println(answer);
    }

    @Test
    public void testSearchingForDirection() {
        String answer = sut.search("Where are we heading?");
        System.out.println(answer);
    }

    @Test
    public void testSearchingForFulfillment() {
        String answer = sut.search("What is best in life?");
        System.out.println(answer);
    }
}
