package com.workshop.wilqor.testing;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Class having a dependency injected in constructor
 * and capable of joining vararg of strings.
 *
 * @author wilqor
 */
public class StringJoiner {
    private final JoinSequenceProvider joinSequenceProvider;

    public StringJoiner(JoinSequenceProvider joinSequenceProvider) {
        this.joinSequenceProvider = joinSequenceProvider;
    }

    /**
     * Joins strings using preconfigured join sequence.
     *
     * @param strings strings to be joined
     * @return joined strings
     */
    public String join(String... strings) {
        return Stream.of(strings)
                .collect(Collectors.joining(joinSequenceProvider.provide()));
    }
}
