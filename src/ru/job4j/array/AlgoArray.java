package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int temp = array[0];
        array[0] = array[4];
        array[4] = temp;
        temp = array[1];
        array[1] = array[3];
        array[3] = temp;
        for (int i : array) {
            System.out.println(i);
        }
    }
}