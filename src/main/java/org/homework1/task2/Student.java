package org.homework1.task2;

public class Student implements Printable {
    String name;
    int recordBooksNumber;
    double gpa;

    public Student(String name, int recordBook, double gpa) {
        this.name = name;
        this.recordBooksNumber = recordBook;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecordBooksNumber() {
        return recordBooksNumber;
    }

    public void setRecordBooksNumber(int recordBooksNumber) {
        this.recordBooksNumber = recordBooksNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public void print() {
        System.out.printf("Student name: %s; student record book number: %s; GPA: %s \n", name, recordBooksNumber, gpa);
    }
}