package org.homework1.task5;

import java.util.Objects;

public class Car implements Drivable{
    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void start() {
        System.out.printf("%s %s (%s) started \n", brand, model, year);
    }

    @Override
    public void stop() {
        System.out.printf("%s %s (%s) stopped \n", brand, model, year);
    }

    @Override
    public void drive(int distance) {
        System.out.printf("%s %s (%s) drove %s miles \n", brand, model, year, distance);
    }
}
