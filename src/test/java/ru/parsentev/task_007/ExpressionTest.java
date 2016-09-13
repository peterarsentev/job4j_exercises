package ru.parsentev.task_007;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ExpressionTest {
    @Test
    public void calc() {
        Expression expr = new Expression("2+2");
        double result = expr.calc();
        assertThat(result, is(4d));
    }

    @Test(expected = IllegalStateException.class)
    public void noValid() {
        new Expression("2+").calc();
    }

    @Test(expected = IllegalStateException.class)
    public void whenMultiOpsThenException() {
        new Expression("2++").calc();
    }
}