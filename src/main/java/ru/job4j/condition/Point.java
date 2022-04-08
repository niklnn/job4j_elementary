package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double sum = first + second;
        double rsl = Math.sqrt(sum);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result1 = Point.distance(1, 2, 3, 4);
        System.out.println("result (1, 2) to (3, 4) " + result1);
        double result2 = Point.distance(4, 4, 8, 3);
        System.out.println("result (4, 4) to (8, 3) " + result2);
    }
}