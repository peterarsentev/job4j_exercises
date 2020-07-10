package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlatIt {
    public static List<Integer> flatten(Iterator<Iterator<Integer>> it) {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        int rsl = "Patrova".compareTo("Petrov");
        System.out.println(rsl);
    }
}
