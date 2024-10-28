package prog;

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

        // Test case authors
        Author author2 = new Author("PrintedBook | #Testcase1");
        Title printTest1 = new PrintedBook("printTest", "TE", 140, 72);
        author2.addTitle(printTest1);

        Author author3 = new Author("AudioBook | #Testcase2");
        Title printTest2 = new AudioBook("printTest2", "SKØN", 10, 400);
        author3.addTitle(printTest2);

        // Calculate total pay for each author
        float a1totalPay = author1.calculateTotalPay();
        float a2totalPay = author2.calculateTotalPay();
        float a3totalPay = author3.calculateTotalPay();

        // Print results
        System.out.println(author1.getName() + ": " + a1totalPay + " kr");
        System.out.println(author2.getName() + ": " + a2totalPay + " kr");
        System.out.println(author3.getName() + ": " + a3totalPay + " kr");
    }
}
