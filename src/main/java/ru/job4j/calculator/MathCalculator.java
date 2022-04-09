package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumDivideAndSubtraction(double first, double second) {
        return divide(first, second) + subtraction(first, second);
    }

    public static double sumAll(double first, double second) {
        return sum(first, second) + multiply(first, second) + divide(first, second) + subtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат первого расчета равен: " + sumAndMultiply(5, 12));
        System.out.println("Результат второго расчета равен: " + sumDivideAndSubtraction(14, 8));
        System.out.println("Результат третьего расчета равен: " + sumAll(23, 11));
    }
}