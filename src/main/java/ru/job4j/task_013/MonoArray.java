package ru.job4j.task_013;





/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class MonoArray {

    private final int[] values;

    public MonoArray(final int[] values) {
        this.values = values;
    }

    public boolean exists() {
        boolean result = true;
        for (int index=0;index!=this.values.length;index++) {
            if (index + 1 < this.values.length && this.values[index] != this.values[index + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
