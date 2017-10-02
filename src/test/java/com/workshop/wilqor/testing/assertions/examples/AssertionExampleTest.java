package com.workshop.wilqor.testing.assertions.examples;

import com.workshop.wilqor.testing.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

/**
 * Example demonstrating usage of core JUnit assertions.
 *
 * @author wilqor
 */
public class AssertionExampleTest {
    @Test
    public void assertTruth_twoPlusTwoIsFour() {
        // description in assert methods is always optional
        Assert.assertTrue("2 plus 2 should be equal to 4", 2 + 2 == 4);
    }

    @Test
    public void assertEquality_integers() {
        // how does it read compared to assertTruth_twoPlusTwoIsFour?
        Assert.assertEquals("2 plus 2 should be equal to 4", 4, 2 + 2);
    }

    @Test
    public void assertEquality_strings() {
        Assert.assertEquals("concatenated string parts should be equal to the concatenation", "abc", "a" + "bc");
    }

    @Test
    public void assertEquality_floatingPoints() {
        // note the last parameter called 'delta'
        Assert.assertEquals(1.01f, 1.0f + 0.009, 0.01f);
    }

    @Test
    public void assertEquality_objects() {
        Point point = new Point(10, 20);
        Point pointWithSameCoordinates = new Point(15 - 5, 15 + 5);
        Assert.assertEquals(point, pointWithSameCoordinates);
    }

    @Test
    public void assertEquality_arrays() {
        // works analogously for other primitives and objects
        Assert.assertArrayEquals(new int[]{10, 20}, new int[]{10, 20});
    }

    @Test
    public void assertNullValue_noValueForEmptyMap() {
        // empty map has no entries, so for each key we expect null
        Map<Integer, String> map = Collections.emptyMap();
        Assert.assertNull(map.get(10));
    }
}
