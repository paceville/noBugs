package org.homework1.task3;

public class Program {

    public static void main(String[] args) {
        Point point1 = new Point(5, 1);
        Point point2 = new Point(0, 0);

        point1.moveRight(7);
        point1.moveDown(7);
        point2.moveUp(1);
        point2.moveLeft(2);
    }
}
