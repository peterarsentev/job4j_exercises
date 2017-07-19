package ru.job4j.task_006;

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
public class SquareTest {
    @Test
    public void checkExists() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(2, 2);
        Point fourth = new Point(2, 0);
        boolean result = new Square(first, second, third, fourth).exists();
        assertThat(result, is(true));
    }

    @Test
    public void inLine() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 2);
        Point third = new Point(0, 4);
        Point fourth = new Point(0, 6);
        boolean result = new Square(first, second, third, fourth).exists();
        assertThat(result, is(false));
    }

    @Test
    public void notSquare() {
        Point first = new Point(0, 0);
        Point second = new Point(1, 2);
        Point third = new Point(1, 4);
        Point fourth = new Point(0, 6);
        boolean result = new Square(first, second, third, fourth).exists();
        assertThat(result, is(false));
    }
}