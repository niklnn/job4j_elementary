package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5elements() {
        int[] data = {7, 5, 4, 3, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 3, 4, 5, 7};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = {4, 7, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = {2, 4, 7};
        Assert.assertArrayEquals(expected, result);
    }
}