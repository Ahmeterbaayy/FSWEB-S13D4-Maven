package org.example;

public class Point {
    private int x;
    private int y;

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

    // distance to (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // distance to another Point
    public double distance(Point p) {
        return Math.sqrt((p.x - this.x) * (p.x - this.x) + (p.y - this.y) * (p.y - this.y));
    }

    // distance to (a,b)
    public double distance(int a, int b) {
        return Math.sqrt((a - this.x) * (a - this.x) + (b - this.y) * (b - this.y));
    }
}

