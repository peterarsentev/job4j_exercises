package ru.job4j.task_005;


import ru.job4j.task_002.Point;
import ru.job4j.task_003.Triangle;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.lang.Math.abs;
import static java.lang.Math.pow;


/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class RightTriangle extends Triangle {

    public RightTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        return (this.round(pow(ab, 2)) == this.round(pow(ca, 2) + pow(bc, 2))) ||
                (this.round(pow(ca, 2)) == this.round(pow(ab, 2) + pow(bc, 2))) ||
                (this.round(pow(bc, 2)) == this.round(pow(ab, 2) + pow(ca, 2)));
    }

    private double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
