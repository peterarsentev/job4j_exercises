package ru.job4j.task_014;



import java.util.Arrays;
import java.util.Iterator;



/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class ReversePhrase {
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
