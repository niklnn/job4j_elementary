package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double s = TrgArea.area(5, 5, 5);
        System.out.println("area (5, 5, 5) = " + s);
    }
}