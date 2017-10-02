package com.workshop.wilqor.testing.assertions.exercises;

import com.workshop.wilqor.testing.Point;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

/**
 * Exercise objective: Use proper assertions in defined tests
 * to check what is described by the method name.
 *
 * @author wilqor
 */
public class AssertionExerciseTest {
    @Test
    public void assertFalse_twoPlusTwoIsNotFive() {
        int twoPlusTwo = 2 + 2;
        int five = 5;
        // place for your assertion using Assert.
    }

    @Test
    public void assertNotNullValue_valueForKeyOneIsNotNull() {
        Map<Integer, String> map = Collections.singletonMap(1, "some value");
        String value = map.get(1);
        // place for your assertion using Assert.
    }

    @Test
    public void testInequality_pointsWithDifferentCoordinatesAreNotEqual() {
        Point pointA = new Point(10, 15);
        Point pointB = new Point(15, 10);
        // place for your assertion using Assert.
    }
}
