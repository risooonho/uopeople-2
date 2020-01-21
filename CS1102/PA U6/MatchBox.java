package ProgAssignUnit6;

public class MatchBox extends Box {
    double weight;
    double volume = width * height * depth;

    public void calculateWeight() {
        // calculates weight based on volume assuming that the volume
        // is a quantity of water which weighs .03611 pounds per cubic inch
        weight = .03611 * volume;
        System.out.println("Weight of matchbox is " + weight);
    }

    MatchBox(double w, double h, double d) {
        super(w, h, d);
    }

    @Override
    public void getVolume() {
        System.out.println("Width of matchbox is: " + width);
        System.out.println("Height of matchbox is: " + height);
        System.out.println("Depth of matchbox is: " + depth);
        calculateWeight();
        System.out.println("Volume is: " + volume);
    }
}