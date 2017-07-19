package ru.job4j.task_020;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class CombineTest {
    @Test
    public void whenTwoThenTwoCombinations() {
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
    public void whenTreeThenSixCombinations() {
        Combine combine = new Combine(new int[] {1, 2, 3});
        List<List<Integer>> result = combine.generate();
        assertThat(result, is(
                        asList(
                                asList(1, 2, 3),
                                asList(1, 3, 2),
                                asList(2, 1, 3),
                                asList(2, 3, 1),
                                asList(3, 1, 2),
                                asList(3, 2, 1)
                        )
                )
        );
    }

    @Test
    public void  whenFourThen24Combinations() {
        Combine combine = new Combine(new int[] {1, 2, 3, 4});
        List<List<Integer>> result = combine.generate();
        assertThat(result.size(), is(24));
    }
}