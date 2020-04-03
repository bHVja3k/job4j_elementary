package ru.job4j.array;

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int r = 0; r < size; r++) {
                table[i][r] = (i + 1) * (r + 1);
            }
        }
        return table;
    }
}