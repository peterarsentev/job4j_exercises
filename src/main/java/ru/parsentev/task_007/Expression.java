package ru.parsentev.task_007;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class Expression {
    private static final Logger log = getLogger(Expression.class);

    private final String expr;

    public Expression(final String expr) {
        this.expr = expr;
    }

    public double calc() {
        throw new UnsupportedOperationException();
    }
}
