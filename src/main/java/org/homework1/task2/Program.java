package org.homework1.task2;

public class Program {

    public static void main(String[] args) {
        Student student1 = new Student("John White", 001000, 4.5);

        Student student2 = new Student(null, 0, 0);
        student2.setName("Thomas Green");
        student2.setRecordBooksNumber(001001);
        student2.setGpa(5);

        student1.print();
        student2.print();
    }
}
