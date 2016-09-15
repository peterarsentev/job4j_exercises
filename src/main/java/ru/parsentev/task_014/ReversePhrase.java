package ru.parsentev.task_014;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Iterator;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class ReversePhrase {
    private static final Logger log = getLogger(ReversePhrase.class);
    private final String line;

    public ReversePhrase(final String line) {
        this.line = line;
    }

    public String reverse() {
        final String[] phrases = this.line.split(" ");
        for (int index=0;index!=phrases.length/2;index++) {
            String temp = phrases[phrases.length - index - 1];
            phrases[phrases.length - index - 1] = phrases[index];
            phrases[index] = temp;
        }
        return this.convert(phrases, ' ');
    }

    private String convert(String[] values, char separator) {
        StringBuilder result = new StringBuilder();
        Iterator<String> it = Arrays.asList(values).iterator();
        while (it.hasNext()) {
            result.append(it.next());
            if (it.hasNext()) {
                result.append(separator);
            }
        }
        return result.toString();
    }
}
