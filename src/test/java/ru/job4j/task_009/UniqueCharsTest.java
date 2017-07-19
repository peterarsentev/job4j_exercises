package ru.job4j.task_009;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class UniqueCharsTest {
    @Test
    public void whenOneCharThenOneUnique() {
        UniqueChars unique = new UniqueChars("1");
        int result = unique.unique();
        assertThat(result, is(1));
    }

    @Test
    public void hasNotUnique() {
        UniqueChars unique = new UniqueChars("2+2");
        int result = unique.unique();
        assertThat(result, is(2));
    }

    @Test
    public void onlyUnique() {
        UniqueChars unique = new UniqueChars("123");
        int result = unique.unique();
        assertThat(result, is(3));
    }

    @Test
    public void onlyDublicate() {
        UniqueChars unique = new UniqueChars("1111");
        int result = unique.unique();
        assertThat(result, is(1));
    }
}