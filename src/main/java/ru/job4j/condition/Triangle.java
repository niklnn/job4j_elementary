package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double bc, double ac) {
        return ab + bc > ac && bc + ac > ab && ab + ac > bc;
    }

    public static void main(String[] args) {
        System.out.println("Треугольник может существовать? - " + Triangle.exist(4, 4, 5));
    }
}