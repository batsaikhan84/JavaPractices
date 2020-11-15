package com.practices.ConstructorPractices;

public class Point {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0, 0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2, 2) = " + first.distance(2, 2));
        System.out.println("distance() = " + first.distance());
    }
    private int x;
    private int y;
    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public double distance() {
        double distance = Math.sqrt((this.x)*(this.x) + (this.y)*(this.y));
        return distance;
    }
    public double distance(int x, int y) {
        double distance = Math.sqrt((this.x - x)*(this.x - x) + (this.y - y)*(this.y - y));
        return distance;
    }
    public double distance(Point point) {
        double distance = Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
        return distance;
    }
}
