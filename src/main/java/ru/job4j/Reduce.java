package ru.job4j;

import org.w3c.dom.ls.LSOutput;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}

