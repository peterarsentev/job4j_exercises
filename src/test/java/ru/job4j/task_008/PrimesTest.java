package ru.job4j.task_008;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class PrimesTest {
    @Test
    public void calc() {
        Primes primes = new Primes(3);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(1, 2, 3)));
    }

    @Test
    public void inFive() {
        Primes primes = new Primes(5);
        List<Integer> result = primes.calc();
        assertThat(result, is(asList(1, 2, 3, 5)));
    }
}