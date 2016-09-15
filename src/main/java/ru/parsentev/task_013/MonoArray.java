package ru.parsentev.task_013;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class MonoArray {
    private static final Logger log = getLogger(MonoArray.class);

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
