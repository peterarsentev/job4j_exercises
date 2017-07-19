package ru.job4j.task_011;





/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class ArrayContainsOne {
    private final int[] values;

    public ArrayContainsOne(final int[] values) {
        this.values = values;
    }

    public boolean containsOnlyOne() {
        boolean result = true;
        for (int value : this.values) {
            if (value != 1) {
                result = false;
                break;
            }
        }
        return result;
    }
}
