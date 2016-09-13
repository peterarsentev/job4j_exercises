package ru.parsentev.task_001;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * @author parsentev
 * @since 18.07.2016
 */
public class Calculator {
    private static final Logger log = getLogger(Calculator.class);
    private double result;

    public double getResult() {
        return this.result;
    }

    public void add(double first, double second) {
        this.result = first + second;
    }

    public void subtract(double first, double second) {
        this.result = first - second;
    }

    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public void div(double first, double second) {
        if (second == 0d) {
            throw new IllegalStateException("Div by Zero");
        }
        this.result = first / second;
    }

    public void expand(double first, double second) {
        this.result = first;
        for (int index=1;index!=second;index++) {
            this.result *= first;
        }
    }
}
