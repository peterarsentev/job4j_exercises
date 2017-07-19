package ru.job4j.task_007;





/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class Expression {

    private final String expr;

    public Expression(final String expr) {
        this.expr = expr;
    }

    public double calc() {
        final String[] values = this.expr.split("(\\+|-|/|\\*)");
        if (values.length == 2) {
            final int size =  values[0].length();
            return this.calc(
                    Double.valueOf(values[0]),
                    Double.valueOf(values[1]),
                    this.expr.substring(size, size + 1)
            );
        } else {
            throw new IllegalStateException();
        }
    }

    public double calc(double first, double second, String op) {
        final double result;
        if ("+".equals(op)) {
            result = first + second;
        } else if ("-".equals(op)) {
            result = first - second;
        } else if ("/".equals(op)) {
            result = first / second;
        } else if ("*".equals(op)) {
            result = first * second;
        } else {
            throw new UnsupportedOperationException(
                    String.format("operation unsupported %s", op)
            );
        }
        return result;
    }
}
