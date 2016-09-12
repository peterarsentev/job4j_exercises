package ru.parsentev.task_006;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Square {
    private static final Logger log = getLogger(Square.class);

    private final Point first;
    private final Point second;
    private final Point third;
    private final Point fourth;

    public Square(final Point first, final Point second, final Point third, final Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    public boolean exists() {
        final double ab = this.first.distanceTo(this.second);
        final double bc = this.second.distanceTo(this.third);
        final double cd = this.third.distanceTo(this.fourth);
        final double da = this.fourth.distanceTo(this.first);
        final double ac = this.first.distanceTo(this.third);
        final double bd = this.second.distanceTo(this.fourth);
        return ab == bc && bc == cd && cd == da && ac == bd;
    }
}
