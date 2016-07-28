package ru.parsentev.task_015;

import org.junit.Ignore;
import org.junit.Test;
import ru.parsentev.task_014.ReversePhrase;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
@Ignore
public class CycleShiftTest {

    @Test
    public void multi() {
        CycleShift cycle = new CycleShift(new int[] {1, 2, 3, 4, 5});
        int[] result = cycle.shift(2);
        assertThat(result, is(new int[] {4, 5, 1, 2, 3}));
    }

    @Test
    public void one() {
        CycleShift cycle = new CycleShift(new int[] {1});
        int[] result = cycle.shift(2);
        assertThat(result, is(new int[] {1}));
    }
}