package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (char value : word) {
            for (char c : pref) {
                if (value == c) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}