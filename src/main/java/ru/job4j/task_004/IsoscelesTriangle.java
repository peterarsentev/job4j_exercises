package ru.job4j.task_004;


import ru.job4j.task_002.Point;
import ru.job4j.task_003.Triangle;



/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class IsoscelesTriangle extends Triangle {

    public IsoscelesTriangle(Point first, Point second, Point third) {
        super(first, second, third);
    }

    @Override
    public boolean exists() {
        boolean result = false;
        if (super.exists()) {
            result = this.ab == this.bc || this.ca == this.bc || this.ab == this.ca;
        }
        return result;
    }
}
