package ru.parsentev.task_012;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * TODO: comment
 *
 * @author parsentev
 * @since 28.07.2016
 */
public class SequenceArray {
    private static final Logger log = getLogger(SequenceArray.class);

    private final int[] values;

    public SequenceArray(final int[] values) {
        this.values = values;
    }

    public boolean containsOneSequence() {
        boolean result = false;
        for (int index=0;index!=this.values.length;index++) {
            if (index + 2 < this.values.length &&
                    this.values[index] == 1 &&
                    this.values[index + 1] == 1 &&
                    this.values[index + 2] == 1) {
                result = true;
                break;
            }
        }
        return result;
    }
}
