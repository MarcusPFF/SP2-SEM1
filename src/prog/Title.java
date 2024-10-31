package prog;

    //Abstract class because we use this as a template for the other classes by extending to this.
public abstract class Title {
    //Initialising instance variables
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    //Constructor
    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    //Getter
    public String getLiteratureType() {
        return literatureType;
    }

    public int getCopies() {
        return copies;
    }
    //Calculate royalty method
    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }
    //Abstract classes used for template
    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints();
}
