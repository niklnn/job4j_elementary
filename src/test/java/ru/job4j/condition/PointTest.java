package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to00then0() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        double expected = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when12to34then2dot828() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double expected = 2.828;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when22to88then8dot485() {
        int x1 = 2;
        int y1 = 2;
        int x2 = 8;
        int y2 = 8;
        double expected = 8.485;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.001);
    }
}