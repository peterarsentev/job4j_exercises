package ru.parsentev.task_018;

import org.junit.Ignore;
import org.junit.Test;
import ru.parsentev.task_015.CycleShift;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class PoolTest {
    @Test
    public void whenFieldHasMultiUnionThenReturnMax() {
        Pool pool = new Pool(
                new int[][] {
                        {1, 0, 0},
                        {1, 1, 0},
                        {0, 0, 1}
                }
        );
        int result = pool.maxUnion();
        assertThat(result, is(3));
    }

    @Test
    public void whenUnionInLastLineThenFour() {
        Pool pool = new Pool(
                new int[][] {
                        {1, 0, 0},
                        {0, 1, 1},
                        {0, 1, 1}
                }
        );
        int result = pool.maxUnion();
        assertThat(result, is(4));
    }

    @Test
    public void whenAllFieldUnionThenReturnTotalSize() {
        Pool pool = new Pool(
                new int[][] {
                        {1, 1, 1},
                        {1, 1, 1},
                        {1, 1, 1}
                }
        );
        int result = pool.maxUnion();
        assertThat(result, is(9));
    }
}