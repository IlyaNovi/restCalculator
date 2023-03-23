package ru.netology.restcalculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class restCalculatorTest {
    @Test
    void restCalcOne() {
        restCalculator service = new restCalculator();
        int income = 10000;
        int expence = 3000;
        int threchold = 20000;
        int expected = 3;

        int actual = service.calculate(income, expence, threchold);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void restCalcTwo() {
        restCalculator service = new restCalculator();
        int income = 100000;
        int expence = 60000;
        int threchold = 150000;
        int expected = 2;

        int actual = service.calculate(income, expence, threchold);
        Assertions.assertEquals(expected, actual);

    }
}
