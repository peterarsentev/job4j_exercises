package ru.parsentev.task_014;

import org.junit.Ignore;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
@Ignore
public class ReversePhraseTest {
    @Test
    public void oneWords() {
        ReversePhrase phrase = new ReversePhrase("code and earn");
        String result = phrase.reverse();
        assertThat(result, is("earn and code"));
    }

    @Test
    public void oneWord() {
        ReversePhrase phrase = new ReversePhrase("Java");
        String result = phrase.reverse();
        assertThat(result, is("Java"));
    }
}