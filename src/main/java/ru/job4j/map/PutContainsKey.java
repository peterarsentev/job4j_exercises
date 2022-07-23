package ru.job4j.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PutContainsKey {

    public static Map<Integer, User> addNewElementWithoutCheck(List<User> list) {
        Map<Integer, User> result = new HashMap<>();
        for (User user : list) {
            result.put(user.id, user);
        }
        return result;
    }

    public static Map<Integer, User> addNewElementWithCheck(List<User> list) {
        Map<Integer, User> result = new HashMap<>();
        for (User user : list) {
            result.put(user.id, user);
        }
        return result;
    }

    public record User(int id, String name) {
    }
}
