package prog;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Author {
    //Initialising instance variables
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();
    /*
    Found on stackoverflow. DecimalFormat instance variable to format numbers to two decimal places.
    Using this for the toString method when printing.
     */
    private static final DecimalFormat df = new DecimalFormat("0.00");

    //Constructor
    public Author(String name) {
        this.name = name;
    }

    /* Methods
    This one adds a title to an ArrayList.
     */
    public void addTitle(Title title) {
        titles.add(title);
    }

    //This one calculates total pay, by looping through the ArrayList<Title>
    public double calculateTotalPay() {
        double total = 0;
        for (Title title : titles) {
            total += (float) title.calculateRoyalty();
        }
        return total;
    }

    // The toString method formats the output, ensuring the total pay displays with only two decimal places using df.format().
    @Override
    public String toString() {
        return name + ": " + df.format(calculateTotalPay()) + " kr";
    }
}

