package ru.job4j.loop;

public class Mortgage {

    public static int year(double amount, double salary, double percent) {
        int year = 0;
        int divide = 100;
        while (amount > 0) {
            amount += amount / divide * percent - salary;
            year++;
        }
        return  year;
    }
}