package com.workshop.wilqor.testing;

/**
 * A dependency of {@link StringJoiner} that simulates
 * costly initialization that has to be done once.
 *
 * @author wilqor
 */
public class JoinSequenceProvider {
    private static final int WAITING_TIME_IN_MILLIS = 5_000;

    private final String joinSequence;

    public JoinSequenceProvider() {
        System.out.println("Looking for the magic sequence...");
        try {
            Thread.sleep(WAITING_TIME_IN_MILLIS);
            System.out.println("Found it!");
        } catch (InterruptedException e) {
            System.err.println("Wait interrupted with exception" + e);
        }
        this.joinSequence = "*";
    }

    /**
     * Provides a sequence for joining strings.
     *
     * @return joining sequence
     */
    String provide() {
        return joinSequence;
    }
}
