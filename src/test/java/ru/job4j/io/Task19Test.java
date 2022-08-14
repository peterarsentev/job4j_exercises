package ru.job4j.io;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Task19Test {
    @Test
    public void shouldOutputStringWithTwoVariables() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task19.main(null);
        String expected = "Значение x равно 4; значение y равно 11" + System.lineSeparator()
                + "Произведение x и y равно 44" + System.lineSeparator()
                + "Сумма x и y равно 15";
        assertThat(out.toString(), is(expected));
    }
}