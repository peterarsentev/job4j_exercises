package ru.job4j.task_015;





/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class CycleShift {

    private final int[] values;

    public CycleShift(final int[] values) {
        this.values = values;
    }

    public int[] shift(int position) {
        for (int shift=0;shift!=position;shift++) {
            int temp = this.values[this.values.length - 1];
            for (int index=0;index<this.values.length - 1;index++) {
                this.values[this.values.length - index - 1] = this.values[this.values.length - index - 2];
            }
            this.values[0] = temp;
        }
        return this.values;
    }
}
