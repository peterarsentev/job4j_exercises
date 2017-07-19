package ru.job4j.task_017;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class CashMachine {

    private final int[] values;

    public CashMachine(final int[] values) {
        this.values = values;
    }

    public List<List<Integer>> exchange(int note) {
        return this.exchange(note, 0);
    }

    public List<List<Integer>> exchange(int note, int step) {
        List<List<Integer>> data = new ArrayList<>();
        for (int index = step; index != this.values.length; index++) {
            final int value = this.values[index];
            int rsl = note - this.values[index];
            if (rsl == 0) {
                data.add(new ArrayList<>(Collections.singletonList(value)));
            } else {
                for (List<Integer> sub : this.exchange(rsl, index)) {
                    sub.add(value);
                    data.add(sub);
                }
            }
        }
        return data;
    }

}
