package ru.job4j.type;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShortTypeTest {

    @Test
    public void whenEnter4() {
        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        ShortType.main(null);
        assertThat(out.toString(), is("4" + System.lineSeparator()));
    }

    @Test
    public void whenEnter5() {
        ByteArrayInputStream in = new ByteArrayInputStream("5".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        System.setIn(in);
        ShortType.main(null);
        assertThat(out.toString(), is("5" + System.lineSeparator()));
    }
}