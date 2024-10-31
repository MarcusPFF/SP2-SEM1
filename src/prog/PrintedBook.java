package prog;

public class PrintedBook extends Title {
    //Initialising instance variable.
    private int pages;

    //Constructor
    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    /* Creating methods extended from Title.java
    This method calculates points
    */
    @Override
    protected double calculatePoints() {
        return pages * getCopies() * calculateLiteraturePoints();
    }

    /* Creating methods extended from Title.java
    This method calculates literature points, by using a switch. Values are from the task.
     */
    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()) {
            case "BI", "TE" -> 3;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0.0;
        };
    }
}