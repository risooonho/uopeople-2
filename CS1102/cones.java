package IceCreamCount;

import textio.TextIO;

public class Main {

    public static void main(String[] args) {

        // Open file for reading; if it can't be opened, end the program
        try {
            TextIO.readFile("C:\\Users\\hex0j\\IdeaProjects\\IceCreamCount\\src\\icecream.dat");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Can't open icecream.dat :(");
            System.exit(1);  // Terminates the program.
        }

        // Read the file, keeping track of total cones, strawberry and % strawberry

        // declaring variables
        String flavor = "";
        int conesTotal = 0; // counting cones total
        int strawberryTotal = 0; // counting strawberry cones
        double strawberryPercent = 0; // percent of strawberry cones

        while (!TextIO.eof()) {  // process one line of data.
            flavor = TextIO.getln();  // read an entire input line as a String.
            conesTotal += 1;
            if (flavor.equals("Strawberry"))
                strawberryTotal += 1; // adds to a total of strawberry cones
            strawberryPercent = ((float)strawberryTotal / conesTotal * 100); // % of strawberry cones
        }

        System.out.println("Total number of cones: " + conesTotal);
        System.out.println("Number of strawberry cones: " + strawberryTotal + " (" + (Math.round(strawberryPercent) + "%)"));
    }
}