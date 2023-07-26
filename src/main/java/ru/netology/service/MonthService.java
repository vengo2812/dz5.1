package ru.netology.service;

public class MonthService {
    public int calculate(int income, int expenses, int threshold) {

        int month = 0;
        int money = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                month++;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return month;

    }
}
