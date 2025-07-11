package org.example;

public class Point {
    private int x;
    private  int y;

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
        return distance(0, 0);
    }

    public double distance(Point p) {
        return distance(p.x, p.y);
    }

    public double distance(int a, int b) {
        int dx = this.x - a;
        int dy = this.y - b;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
