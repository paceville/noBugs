package org.homework1.task5;

import org.homework1.task4.Clock;

public class Program {
    public static void main(String[] args) {
        Car mercedes = new Car("Mercedes-Benz", "GLC", 2024);
        mercedes.start();
        mercedes.stop();
        mercedes.drive(15);
    }
}
