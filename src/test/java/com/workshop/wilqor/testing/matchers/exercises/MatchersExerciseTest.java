package com.workshop.wilqor.testing.matchers.exercises;

import com.workshop.wilqor.testing.Point;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/**
 * Exercise objective: Use Hamcrest matchers in defined tests
 * to check what is described by the method name.
 *
 * @author wilqor
 */
public class MatchersExerciseTest {
    @Test
    public void assertInequality_pointsWithDifferentCoordinatesAreNotEqual() {
        Point pointA = new Point(10, 15);
        Point pointB = new Point(15, 10);
        // place for your assertion using MatcherAssert.assertThat and proper matcher from Matchers.
        // hint: almost the same like asserting equality
    }

    @Test
    public void assertNotNullValue_valueForKeyOneIsNotNull() {
        Map<Integer, String> map = Collections.singletonMap(1, "some value");
        String value = map.get(1);
        // place for your assertion using MatcherAssert.assertThat and proper matcher from Matchers.
        // hint: almost the same like asserting null value
    }

    @Test
    public void assertStringEqualityIgnoringCase_differentCaseStrings() {
        String lowerCase = "somestring";
        String upperCase = "SOMESTRING";
        // place for your assertion using MatcherAssert.assertThat and proper matcher from Matchers.
    }

    @Test
    public void assertStringContainsSubstringInTheMiddle() {
        String container = "the password is: qwerty";
        String content = "password";
        // place for your assertion using MatcherAssert.assertThat and proper matcher from Matchers.
    }

    @Test
    public void assertCollectionHasSize5() {
        Collection<Integer> numbers = Arrays.asList(42, 15, 21, 40, 13);
        // place for your assertion using MatcherAssert.assertThat and proper matcher from Matchers.
    }

    @Test
    public void assertPointsCollectionHasPointsAAndB() {
        Point pointA = new Point(10, 20);
        Point pointB = new Point(100, 200);
        Point pointC = new Point(200, 100);
        Point pointD = new Point(5, 0);
        Collection<Point> points = Arrays.asList(pointA, pointB, pointC, pointD);
        // place for your assertion using MatcherAssert.assertThat and proper matcher from Matchers.
        // hint: the proper matcher refers to collection elements as items
    }
}
