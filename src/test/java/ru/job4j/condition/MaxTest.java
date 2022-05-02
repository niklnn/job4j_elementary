package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax1To2To3Then3() {
        int out = Max.max(1, 2, 3);
        int expected = 3;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax2To2To3To4Then4() {
        Max max = new Max();
        int out = max.max(2, 2, 3, 4);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }
}