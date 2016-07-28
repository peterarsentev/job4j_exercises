package ru.parsentev.task_013;

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
@Ignore
public class MonoArrayTest {
    @Test
    public void mono() {
        MonoArray array = new MonoArray(new int[] {1, 1, 1});
        boolean result = array.exists();
        assertThat(result, is(true));
    }

    @Test
    public void notMono() {
        MonoArray array = new MonoArray(new int[] {0, 1, 1, 1, 0});
        boolean result = array.exists();
        assertThat(result, is(false));
    }
}