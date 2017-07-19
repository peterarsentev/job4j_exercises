package ru.job4j.task_001;


/**
 * @author job4j
 * @since 18.07.2016
 */
public class Calculator {
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
