package ru.job4j.io;

public class Task15 {
    public static void main(String[] args) {
        String source = "+!?";
        // YOUR CODE
        String[] symbols = source.split("");
        String string = symbols[0].repeat(3) + System.lineSeparator() +
                symbols[1].repeat(4) + System.lineSeparator() +
                symbols[2].repeat(2);
        System.out.print(string);
    }
}
