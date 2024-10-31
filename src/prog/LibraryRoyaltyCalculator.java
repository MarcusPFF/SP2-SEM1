package prog;

import java.util.ArrayList;

public class LibraryRoyaltyCalculator {
    public void runProgram() {
        // Creating author with data
        Author author1 = new Author("Marcus Forsberg");
        Title book1 = new PrintedBook("Den lille Havfrue", "SKØN", 500, 140);
        Title book2 = new PrintedBook("Er du i verden vide", "LYRIK", 1200, 1);
        Title audioBook = new AudioBook("Fyrtøjet", "SKØN", 300, 50);

        author1.addTitle(book1);
        author1.addTitle(book2);
        author1.addTitle(audioBook);

        // Test cases (Values from the task)
        Author author2 = new Author("PrintedBook | #Testcase1");
        Title printTest1 = new PrintedBook("printTest", "TE", 140, 72);
        author2.addTitle(printTest1);

        Author author3 = new Author("AudioBook | #Testcase2");
        Title printTest2 = new AudioBook("printTest2", "SKØN", 10, 400);
        author3.addTitle(printTest2);

        // Calculate total pay for each author
        double a1totalPay = author1.calculateTotalPay();
        double a2totalPay = author2.calculateTotalPay();
        double a3totalPay = author3.calculateTotalPay();

        //Adding author1,2,3 to an ArrayList
        ArrayList<Author> AuthorList = new ArrayList<>();
        AuthorList.add(author1);
        AuthorList.add(author2);
        AuthorList.add(author3);

        //Looping through the arraylist and printing out every Author.
        for (Author author : AuthorList) {
            System.out.println(author);
        }
    }
}
