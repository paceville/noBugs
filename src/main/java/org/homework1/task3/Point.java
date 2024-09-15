package org.homework1.task3;

public class Point implements Movable {
    int x;
    int y;

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

    @Override
    public void moveUp(int n) {
        x =+ n;
        System.out.printf("new point coordinates: x = %s; y = %s; \n", x, y);
    }

    @Override
    public void moveDown(int n) {
        x =- n;
        System.out.printf("new point coordinates: x = %s; y = %s; \n", x, y);
    }

    @Override
    public void moveLeft(int n) {
        y =- n;
        System.out.printf("new point coordinates: x = %s; y = %s; \n", x, y);
    }

    @Override
    public void moveRight(int n) {
        y =+ n;
        System.out.printf("new point coordinates: x = %s; y = %s; \n", x, y);
    }
}