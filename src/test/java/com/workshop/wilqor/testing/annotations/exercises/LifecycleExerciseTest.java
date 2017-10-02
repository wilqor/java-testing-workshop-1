package com.workshop.wilqor.testing.annotations.exercises;

import com.workshop.wilqor.testing.JoinSequenceProvider;
import com.workshop.wilqor.testing.StringJoiner;

/**
 * Exercise objective: Use proper test lifecycle annotations on methods
 * to make the tests run and pass successfully - do NOT modify method bodies.
 *
 * @author wilqor
 */
public class LifecycleExerciseTest {
    private static JoinSequenceProvider joinSequenceProvider;

    private StringJoiner sut;

    public static void prepareJoinSequenceProvider() {
        joinSequenceProvider = new JoinSequenceProvider();
    }

    public void prepareStringJoiner() {
        sut = new StringJoiner(joinSequenceProvider);
    }

    public void testJoining_oneString() {
        String joined = sut.join("1");
        System.out.println(joined);
    }

    public void testJoining_twoStrings() {
        String joined = sut.join("1", "2");
        System.out.println(joined);
    }

    public void testJoining_threeStrings() {
        String joined = sut.join("1", "2", "3");
        System.out.println(joined);
    }
}
