package ru.job4j.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double three = Math.pow(first, 2);
        double four = Math.pow(second, 2);
        double five = three + four;
        double rls = Math.sqrt(five);
        return rls;
    }

    public static void main(String[] args) {
        double result = Point.distance(1, 2, 8, 6);
        System.out.println("result (1, 2) to (8, 6) " + result);
    }
}

