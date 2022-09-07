package ru.job4j.io;

public class Task16 {
    public static void main(String[] args) {
        String source = "+!?";
        // YOUR CODE
        String[] symbols = source.split("");
        String string = symbols[0].repeat(3)
                + symbols[1].repeat(4) + symbols[2].repeat(2);
        System.out.print(string);
    }
}
