package ru.job4j.task_009;

/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class UniqueChars {
    private final String line;

    public UniqueChars(final String line) {
        this.line = line;
    }

    public int unique() {
        int result = 0;
        for (int out=0;out!=this.line.length();out++) {
            boolean count = true;
            for (int in=0;in!=out;in++) {
                if (this.line.charAt(out) == this.line.charAt(in)) {
                    count = false;
                    break;
                }
            }
            if (count) {
                ++result;
            }

        }
        return result;
    }
}
