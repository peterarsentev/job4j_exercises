package ru.job4j.io;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task13Test {

    @Test
    public void whenDelimiterIsPastedBetweenLettersOfString() {
        ByteArrayInputStream in = new ByteArrayInputStream("Hello, friend!".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        Task13.main(null);
        assertThat(out.toString(), is("H-e-l-l-o-,-f-r-i-e-n-d!"));
    }
}