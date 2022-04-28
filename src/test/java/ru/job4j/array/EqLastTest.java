package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class EqLastTest {
    @Test
    public void whenEq() {
        int[] left = {2, 7, 3, 4};
        int[] right = {1, 2, 5, 4};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotEq() {
        int[] left = {1, 2, 3, 4};
        int[] right = {3, 7, 2, 5};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}