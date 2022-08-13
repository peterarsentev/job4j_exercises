package ru.job4j.io;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task14Test {
    @Test
    public void eachSequenceOfSameSymbolsOnSeparateLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task14.main(null);
        String expected = String.format("+++%S!!!!%S??", System.lineSeparator(), System.lineSeparator());
        assertThat(out.toString(), is(expected));
    }
}