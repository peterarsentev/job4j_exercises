package ru.job4j.io;

public class Task13 {
    public static void main(String[] args) {
        // YOUR CODE
        String greeting = "Hello, friend!";
        String[] split = greeting.replaceAll("\\s+", "").split("");
        String result = String.join("-", split).replace("-!", "!");
        System.out.print(result);
    }
}
