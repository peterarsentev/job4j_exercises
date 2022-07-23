package ru.job4j.hash;

import java.util.List;

public class Task5 {
    public static List<Integer> multiAssign(List<Task> tasks) {
        return List.of();
    }

    public record Task(Integer taskId, Integer assignId) {
    }
}
