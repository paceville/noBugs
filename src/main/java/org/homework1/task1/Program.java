package org.homework1.task1;

public class Program {

    public static void main(String[] args) {
        Book ToKillAMockinbird = new Book("To kill a Mockinbird", "Harper Lee", 1960);

        Book TheOldManAndSea = new Book(null, null, 0);
        TheOldManAndSea.setName("The Old Man and Sea");
        TheOldManAndSea.setAuthor("Ernest Hemingway");
        TheOldManAndSea.setYear(1952);

        ToKillAMockinbird.display();
        TheOldManAndSea.display();
    }
}
