package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {

        int min = MinDiapason.findMin(data, 0, data.length - 1);
        int index = FindLoop.indexOf(data, min, 0, data.length);


        for (int i = 0; i < data.length; i++) {
            if (data[i] > min) {
                data[i] = min;
            }
        }
        return data;
    }
}