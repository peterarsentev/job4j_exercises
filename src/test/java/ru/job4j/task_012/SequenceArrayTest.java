package ru.job4j.task_012;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class SequenceArrayTest {
    @Test
    public void contains() {
        SequenceArray array = new SequenceArray(new int[] {0, 1, 1, 1, 0});
        boolean result = array.containsOneSequence();
        assertThat(result, is(true));
    }

    @Test
    public void notContains() {
        SequenceArray array = new SequenceArray(new int[] {0, 1, 0, 1, 0});
        boolean result = array.containsOneSequence();
        assertThat(result, is(false));
    }
}