package com.workshop.wilqor.testing.annotations.exercises;

import com.workshop.wilqor.testing.JoinSequenceProvider;
import com.workshop.wilqor.testing.StringJoiner;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Exercise objective: Use proper test lifecycle annotations on methods
 * to make the test pass successfully.
 *
 * @author wilqor
 */
public class LifecycleExerciseTest {
    private static JoinSequenceProvider joinSequenceProvider;

    private StringJoiner sut;

    @BeforeClass
    public static void prepareJoinSequenceProvider() {
        joinSequenceProvider = new JoinSequenceProvider();
    }

    @Before
    public void prepareStringJoiner() {
        sut = new StringJoiner(joinSequenceProvider);
    }

    @Test
    public void testJoiningOneString() {
        String joined = sut.join("1");
        System.out.println(joined);
    }

    @Test
    public void testJoiningTwoStrings() {
        String joined = sut.join("1", "2");
        System.out.println(joined);
    }

    @Test
    public void testJoiningThreeStrings() {
        String joined = sut.join("1", "2", "3");
        System.out.println(joined);
    }
}
