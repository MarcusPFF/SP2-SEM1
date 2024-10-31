package prog;

public class AudioBook extends Title {
    //Initialising instance variables
    private int durationInMinutes;

    //Creating constructor
    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    /* Creating methods extended from Title.java
    This method calculates points
     */
    @Override
    protected double calculatePoints() {
        return (durationInMinutes * 0.5) * getCopies() * calculateLiteraturePoints();
    }

    /* Creating methods extended from Title.java
    This method calculates literature points, by using a switch. Values are from the task.
     */
    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()) {
            case "BI", "TE" -> 1.5;
            case "LYRIK" -> 3;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.5;
            default -> 0.0;
        };
    }
}
