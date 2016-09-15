package ru.parsentev.task_011;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ArrayContainsOneTest {
    @Test
    public void whenOnlyOneThenCorrect() {
        ArrayContainsOne array = new ArrayContainsOne(new int[] {1});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(true));
    }

    @Test
    public void whenHasZeroThenInCorrect() {
        ArrayContainsOne array = new ArrayContainsOne(new int[] {1, 1, 0});
        boolean result = array.containsOnlyOne();
        assertThat(result, is(false));
    }
}