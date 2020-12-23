package ru.job4j.ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when14to57then5() {
        int expected = 5;
        int x1 = 1;
        int y1 = 4;
        int x2 = 5;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then2() {
        int expected = 2;
        int x1 = 1;
        int y1 = 1;
        int x2 = -1;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when44to44then0() {
        int expected = 0;
        int x1 = 4;
        int y1 = 4;
        int x2 = 4;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}