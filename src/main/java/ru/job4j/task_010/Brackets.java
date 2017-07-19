package ru.job4j.task_010;





/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class Brackets {
    private final String line;

    public Brackets(final String line) {
        this.line = line;
    }

    public boolean isCorrect() {
        final char[] stack = new char[this.line.length()];
        int index = 0;
        int pos = 0;
        while (pos < this.line.length()) {
            if (pos + 1 < this.line.length() && this.line.charAt(pos) == '(' && this.line.charAt(pos + 1) == ')') {
                pos += 2;
            } else if (index > 0 && stack[index - 1] == '(' && this.line.charAt(pos) == ')') {
                index--;
                pos++;
            } else {
                stack[index++] = this.line.charAt(pos);
                pos++;
            }
        }
        return index == 0;
    }
}
