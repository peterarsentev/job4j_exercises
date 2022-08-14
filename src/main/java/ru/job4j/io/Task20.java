package ru.job4j.io;

public class Task20 {
    public static void main(String[] args) {
        String fullName = "Фамилия Имя Отчество";
        String phoneNumber = "+7(938) 123-45-67";
        // YOUR CODE
        int maxLenght = Math.max(fullName.length(), phoneNumber.length());
        String topBorders = "*".repeat(maxLenght + 4);
        String bottomBorders = topBorders;
        String result = topBorders + System.lineSeparator();
        result += "* " + fullName + " ".repeat(maxLenght - fullName.length() + 1)
                + "*" + System.lineSeparator();
        result += "* " + phoneNumber + " ".repeat(maxLenght - phoneNumber.length() + 1)
                + "*" + System.lineSeparator();
        result += bottomBorders;
        System.out.print(result);
    }
}
