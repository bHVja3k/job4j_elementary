package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        // amount - сумма выданная по кредиту
        // salary - годовой доход
        // percent - процентная ставка по кредиту

        int year = 0;
        while (amount >= 0) {
            amount *= percent;
            amount -= salary;
            year++;
        }
        return year;
    }
}