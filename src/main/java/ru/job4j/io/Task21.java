package ru.job4j.io;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        // YOUR CODE
        int level = 2;
        String topSide = star.repeat(columnCount);
        int currentColumn = 1;
        // Количество символов на каждом уровне кроме первого и последнего, чтобы не печатать ненужные крайние пробелы.
        int levelColumnCount;
        StringBuilder result = new StringBuilder(topSide).append(System.lineSeparator());
        while (level < columnCount) {
            levelColumnCount = level <= columnCount / 2 ? columnCount - level + 1 : level;
            while (currentColumn <= levelColumnCount) {
                if (currentColumn == level || currentColumn == columnCount - level + 1) {
                    result.append(star);
                } else {
                    result.append(space);
                }
                currentColumn++;
            }
            result.append(System.lineSeparator());
            level++;
            currentColumn = 1;
        }
        result.append(topSide);
        System.out.print(result);
    }
}
