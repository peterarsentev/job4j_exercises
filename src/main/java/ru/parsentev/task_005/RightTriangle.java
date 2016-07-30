package ru.parsentev.task_005;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.parsentev.task_002.Point;
import ru.parsentev.task_003.Triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class RightTriangle extends Triangle {
    private static final Logger log = getLogger(RightTriangle.class);

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        double ab = this.first.distanceTo(this.second);
        double ac = this.first.distanceTo(this.third);
        double bc = this.second.distanceTo(this.third);
        return (this.round(pow(ab, 2)) == this.round(pow(ac, 2) + pow(bc, 2))) ||
                (this.round(pow(ac, 2)) == this.round(pow(ab, 2) + pow(bc, 2))) ||
                (this.round(pow(bc, 2)) == this.round(pow(ab, 2) + pow(ac, 2)));
    }

    private double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
