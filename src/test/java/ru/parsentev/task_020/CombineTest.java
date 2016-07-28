package ru.parsentev.task_020;

import org.junit.Ignore;
import org.junit.Test;
import ru.parsentev.task_015.CycleShift;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
@Ignore
public class CombineTest {
    @Test
    public void simple() {
        Combine combine = new Combine(new int[] {1, 2});
        List<List<Integer>> result = combine.generate();
        assertThat(result, is(
                        asList(
                                asList(1, 2),
                                asList(2, 1)
                        )
                )
        );
    }

    @Test
    public void three() {
        Combine combine = new Combine(new int[] {1, 2, 3});
        List<List<Integer>> result = combine.generate();
        assertThat(result, is(
                        asList(
                                asList(1, 2, 3),
                                asList(1, 3, 2),
                                asList(2, 1, 3),
                                asList(3, 2, 1)
                        )
                )
        );
    }
}