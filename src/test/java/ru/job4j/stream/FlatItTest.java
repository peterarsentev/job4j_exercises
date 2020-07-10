package ru.job4j.stream;

import org.junit.Test;
import java.util.Iterator;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class FlatItTest {

    @Test
    public void whenIt() {
        Iterator<Iterator<Integer>> it = List.of(
                List.of(1).iterator(),
                List.of(2, 3).iterator()
        ).iterator();
        assertThat(
                FlatIt.flatten(it),
                is(List.of(1, 2, 3))
        );
    }
}