package ru.job4j.hash;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void whenNoUnique() {
        var right = List.of(1, 2, 3);
        var left = List.of(1, 2, 3);
        var expected = List.of();
        var result = Task4.extractUnique(left, right);
        assertThat(result, is(expected));
    }

    @Test
    public void whenFullUnique() {
        var right = List.of(1, 2, 3);
        var left = List.of(4, 5, 6);
        var expected = List.of(1, 2, 3, 4, 5, 6);
        var result = Task4.extractUnique(left, right);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLeftDuplicate() {
        var right = List.of(1, 2, 3);
        var left = List.of(1, 2, 3, 4, 5, 6);
        var expected = List.of(4, 5, 6);
        var result = Task4.extractUnique(left, right);
        assertThat(result, is(expected));
    }

    @Test
    public void whenRightDuplicate() {
        var right = List.of(1, 2, 3, 4, 5, 6);
        var left = List.of(1, 2, 3);
        var expected = List.of(4, 5, 6);
        var result = Task4.extractUnique(left, right);
        assertThat(result, is(expected));
    }
}