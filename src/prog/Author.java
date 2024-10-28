package prog;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Author {
    private String name;
    private ArrayList<Title> titles = new ArrayList<>();
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Author(String name) {
        this.name = name;
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public double calculateTotalPay() {
        double total = 0;
        for (Title title : titles) {
            total += (float) title.calculateRoyalty();
        }
        return total;
    }

    @Override
    public String toString() {
        return name + ": " + df.format(calculateTotalPay()) + " kr";
    }
}

