package ru.parsentev.task_003;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;

import static java.lang.Math.sqrt;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Triangle {
    private static final Logger log = getLogger(Triangle.class);

    protected final double ab;
    protected final double bc;
    protected final double ca;

    public Triangle(final Point first, final Point second, final Point third) {
        this.ab = first.distanceTo(second);
        this.bc = second.distanceTo(third);
        this.ca = third.distanceTo(first);
    }

    public boolean exists() {
        return (this.ab < this.bc + this.ca) &&
                (this.bc < this.ab + this.ca) &&
                (this.ca < this.ab + this.bc);
    }

    public double area() {
        if (this.exists()) {
            double p = (this.ab + this.bc + this.ca)/2;
            return sqrt(p * (p - this.ab) * (p - this.bc) * (p - this.ca));
        } else {
            throw new IllegalStateException("Triangle does not exists");
        }
    }
}
