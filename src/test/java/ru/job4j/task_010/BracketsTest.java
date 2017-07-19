package ru.job4j.task_010;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class BracketsTest {
    @Test
    public void whenExpSequenceBracketsThenCorrect() {
        Brackets brackets = new Brackets("()()()");
        boolean result = brackets.isCorrect();
        assertThat(result, is(true));
    }

    @Test
    public void whenExpOnlyRigthBracketsThenInCorrect() {
        Brackets brackets = new Brackets("(");
        boolean result = brackets.isCorrect();
        assertThat(result, is(false));
    }

    @Test
    public void whenExpHasInnerBracketsThenCorrect() {
        Brackets brackets = new Brackets("(())");
        boolean result = brackets.isCorrect();
        assertThat(result, is(true));
    }

    @Test
    public void whenExpHasOnlyLeftBracketsThenIncorrect() {
        Brackets brackets = new Brackets("((");
        boolean result = brackets.isCorrect();
        assertThat(result, is(false));
    }

    @Test
    public void whenExpHasOnlyRightBracketsThenIncorrect() {
        Brackets brackets = new Brackets("))");
        boolean result = brackets.isCorrect();
        assertThat(result, is(false));
    }

    @Test
    public void whenExpComplexThenCorrect() {
        Brackets brackets = new Brackets("()(()((())))");
        boolean result = brackets.isCorrect();
        assertThat(result, is(true));
    }
}