package ru.job4j.task_002;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class PointTest {
    @Test
    public void whenHasTwoPointThenReturnDistance() {
        final Point first = new Point(0, 0);
        final Point second = new Point(0, 1);
        double result = first.distanceTo(second);
        assertThat(result, closeTo(1d, 0.0005d));
    }
}