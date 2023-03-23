package ru.netology.restcalculator.service;

public class restCalculator {
    public int calculate(int income, int expenses, int threchold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threchold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}