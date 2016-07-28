package ru.parsentev.task_010;

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
@Ignore
public class BracketsTest {
    @Test
    public void valid() {
        Brackets brackets = new Brackets("()()()");
        boolean result = brackets.isCorrect();
        assertThat(result, is(true));
    }

    @Test
    public void inValid() {
        Brackets brackets = new Brackets("(");
        boolean result = brackets.isCorrect();
        assertThat(result, is(false));
    }
}