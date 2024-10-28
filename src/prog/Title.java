package prog;

public abstract class Title {
    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    public int getCopies() {
        return copies;
    }

    public double calculateRoyalty() {
        return calculatePoints() * rate;
    }

    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints();
}
