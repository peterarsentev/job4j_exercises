package ru.job4j.task_020;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * TODO: comment
 *
 * @author job4j
 * @since 28.07.2016
 */
public class Combine {

    private final int[] values;

    public Combine(final int[] values) {
        this.values = values;
    }

    public List<List<Integer>> generate() {
        return combinations(this.values);
    }

    private List<List<Integer>> combinations(int[] list) {
        List<List<Integer>> result = new ArrayList<>();
        if (list.length == 2) {
            result.add(Arrays.asList(list[0], list[1]));
            result.add(Arrays.asList(list[1], list[0]));
        } else {
            for (int index=0;index!=list.length;index++) {
                for (List<Integer> sample : this.combinations(this.create(list, index))) {
                    List<Integer> comb = new ArrayList<>();
                    comb.add(list[index]);
                    comb.addAll(sample);
                    result.add(comb);
                }
            }
        }
        return result;
    }

    private int[] create(int[] list, int exclude) {
        int[] result = new int[list.length-1];
        int pos = 0;
        for (int index=0;index!=list.length;index++) {
            if (index != exclude) {
                result[pos++] = list[index];
            }
        }
        return result;
    }
}
