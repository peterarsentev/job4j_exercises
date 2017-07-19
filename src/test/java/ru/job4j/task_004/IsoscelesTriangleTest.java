package ru.job4j.task_004;

import org.junit.Test;
import ru.job4j.task_002.Point;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class IsoscelesTriangleTest {

    @Test
    public void checkExists() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 0);
        boolean result = new IsoscelesTriangle(first, second, third).exists();
        assertThat(result, is(true));
    }

    @Test
    public void inLine() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 4);
        boolean result = new IsoscelesTriangle(first, second, third).exists();
        assertThat(result, is(false));
    }

    @Test
    public void notIsosceles() {
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        Point third = new Point(0, 5);
        boolean result = new IsoscelesTriangle(first, second, third).exists();
        assertThat(result, is(false));
    }
}