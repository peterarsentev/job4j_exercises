package ru.parsentev.task_002;

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
public class PointTest {
    @Test
    public void whenHasTwoPointThenReturnDistance() {
        final Point first = new Point(0, 0);
        final Point second = new Point(0, 1);
        double result = first.distanceTo(second);
        assertThat(result, is(1d));
    }
}