package ru.parsentev.task_020;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Combine {
    private static final Logger log = getLogger(Combine.class);

    private final int[] values;

    public Combine(final int[] values) {
        this.values = values;
    }

    public List<List<Integer>> generate() {
        throw new UnsupportedOperationException();
    }
}
