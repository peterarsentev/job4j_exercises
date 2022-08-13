package ru.job4j.io;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task14Test {

    @Test
    public void whenDelimiterIsPastedBetweenLettersOfString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task14.main(null);
        assertThat(out.toString(), is("H-e-l-l-o-,-f-r-i-e-n-d!"));
    }
}