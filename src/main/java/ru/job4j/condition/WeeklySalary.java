package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < hours.length; ++i) {
            salary += (i > 4 ? 2 : 1) * (hours[i] * 10 + Math.max(0, hours[i] - 8) * 5);
        }
        return salary;
    }

    public static void main(String[] args) {
        int[] hours = {10, 0, 12, 0, 8, 12, 4};
        System.out.println(calculate(hours));
    }
}