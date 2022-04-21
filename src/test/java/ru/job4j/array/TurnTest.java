package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = Turn.back(input);
        int[] expected = {8, 7, 6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] result = Turn.back(input);
        int[] expected = {7, 6, 5, 4, 3, 2, 1};
        Assert.assertArrayEquals(expected, result);
    }
}