package ru.parsentev.task_019;

import org.junit.Ignore;
import org.junit.Test;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_015.CycleShift;
import ru.parsentev.task_018.Pool;

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
public class MazeTest {
    @Test
    public void singleSolution() {
        Maze maze = new Maze(
                new int[][] {
                        {1, 0, 0},
                        {1, 1, 1},
                        {0, 0, 1}
                }
        );
        List<Point> result = maze.solution(new Point(0, 0), new Point(2, 2));
        assertThat(
                result, is(
                        asList(
                                new Point(0, 0),
                                new Point(1, 0),
                                new Point(1, 1),
                                new Point(2, 1),
                                new Point(2, 2)
                        )
                )
        );
    }

    @Test
    public void multiSolutions() {
        Maze maze = new Maze(
                new int[][] {
                        {1, 1, 1, 0, 1, 1, 1},
                        {1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 0, 1, 0, 1},
                        {1, 0, 1, 1, 1, 0, 1},
                        {1, 0, 0, 0, 0, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1}
                }
        );
        List<Point> result = maze.solution(new Point(0, 0), new Point(6, 5));
        assertThat(
                result, is(
                        asList(
                                new Point(0, 0),
                                new Point(0, 1),
                                new Point(0, 2),
                                new Point(0, 3),
                                new Point(0, 4),
                                new Point(0, 5),
                                new Point(1, 5),
                                new Point(2, 5),
                                new Point(3, 5),
                                new Point(4, 5),
                                new Point(5, 5),
                                new Point(6, 5)
                        )
                )
        );
    }
}