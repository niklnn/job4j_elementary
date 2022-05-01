package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first > second ? first : second;
    }

    public static int maxTree(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int maxFour(int first, int second, int third, int fourth) {
        return max(first, maxTree(second, third, fourth));
    }

    public static void main(String[] args) {
        int rsl = Max.max(12, 23);
        System.out.println("Максимальное число: " + rsl);
        int rsl3 = maxTree(7, 3, 11);
        System.out.println("Максимальное число: " + rsl3);
        Max max = new Max();
        int rsl4 = max.maxFour(35, 15, 22, 22);
        System.out.println("Максимальное число: " + rsl4);
    }
}