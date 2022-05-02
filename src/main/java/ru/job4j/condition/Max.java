package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        int rsl = Max.max(12, 23);
        System.out.println("Максимальное число: " + rsl);
        int rsl3 = max(7, 3, 11);
        System.out.println("Максимальное число: " + rsl3);
        Max max = new Max();
        int rsl4 = max.max(35, 15, 22, 212);
        System.out.println("Максимальное число: " + rsl4);
    }
}