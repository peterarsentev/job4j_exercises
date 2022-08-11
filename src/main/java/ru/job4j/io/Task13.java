package ru.job4j.io;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  inString = input.nextLine();
        // YOUR CODE
        String[] split = inString.replaceAll("\\s+", "").split("");
        String result = String.join("-", split).replace("-!", "!");
        System.out.print(result);
    }
}
