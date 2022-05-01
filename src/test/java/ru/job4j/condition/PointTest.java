package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to00then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double out = a.distance(b);
        double expected = 0;
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when12to34then2dot828() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        double expected = 2.828;
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void when22to88then8dot485() {
        Point a = new Point(2, 2);
        Point b = new Point(8, 8);
        double out = a.distance(b);
        double expected = 8.485;
        Assert.assertEquals(expected, out, 0.001);
    }
}