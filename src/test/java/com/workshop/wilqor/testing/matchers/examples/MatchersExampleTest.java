package com.workshop.wilqor.testing.matchers.examples;

import com.workshop.wilqor.testing.Point;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Collections;
import java.util.Map;

/**
 * Example demonstrating usage of Hamcrest matchers.
 *
 * @author wilqor
 */
public class MatchersExampleTest {
    @Test
    public void assertTruth_twoPlusTwoIsFour() {
        // there is no negative alternative
        MatcherAssert.assertThat("2 plus 2 should be equal to 4", 2 + 2 == 4);
    }

    @Test
    public void assertEquality_integers() {
        // psst, see what happens when you add static imports!
        MatcherAssert.assertThat("2 plus 2 should be equal to 4", 2 + 2, Matchers.is(Matchers.equalTo(4)));
    }

    @Test
    public void assertEquality_strings() {
        // by the way, the "equalTo" part is optional, but looks better with static imports
        MatcherAssert.assertThat("concatenated string parts should be equal to the concatenation",
                "a" + "bc", Matchers.is(Matchers.equalTo("abc")));
    }

    @Test
    public void assertEquality_doublePrecisionFloatingPoints() {
        // note: only double precision floating point is supported
        MatcherAssert.assertThat(1.0d + 0.009, Matchers.is(Matchers.closeTo(1.01d, 0.01d)));
    }

    @Test
    public void assertEquality_objects() {
        Point point = new Point(10, 20);
        Point pointWithSameCoordinates = new Point(15 - 5, 15 + 5);
        MatcherAssert.assertThat(pointWithSameCoordinates, Matchers.is(Matchers.equalTo(point)));
    }

    @Test
    public void assertNullValue_noValueForEmptyMap() {
        // empty map has no entries, so for each key we expect null
        Map<Integer, String> map = Collections.emptyMap();
        MatcherAssert.assertThat(map.get(10), Matchers.is(Matchers.nullValue()));
    }

    @Test
    public void assertAnyOf_integerOutsideExclusiveRange() {
        // at least one condition has to be true
        MatcherAssert.assertThat(150, Matchers.anyOf(
                Matchers.lessThan(50),
                Matchers.greaterThan(100)
        ));
    }

    @Test
    public void testAllOf_integerInsideRangeInclusive() {
        // each condition has to be true
        MatcherAssert.assertThat(150, Matchers.allOf(
                Matchers.greaterThanOrEqualTo(100),
                Matchers.lessThanOrEqualTo(150)
        ));
    }
}
