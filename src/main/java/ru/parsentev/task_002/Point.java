package ru.parsentev.task_002;

import org.slf4j.Logger;

import static java.lang.Math.*;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * Class Point defines a point in coodrional system (x, y).
 * @author parsentev
 * @since 19.07.2016
 */
public class Point {
    private static final Logger log = getLogger(Point.class);

    private final int x;
    private final int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(final Point point) {
        return sqrt(pow(abs(this.x - point.x), 2) + pow(abs(this.y - point.y), 2));
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", this.x, this.y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
