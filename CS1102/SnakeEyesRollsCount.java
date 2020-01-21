package SnakeEyesCounter;

public class Main {
    public static void main(String[] args) {
        // declaring the variables
        int die1, die2, rollsCount, i;
        rollsCount = 0;

        // starting the loop
        while (true) {
            die1 = (int) (Math.random() * 6) + 1; // rolling 1st dice
            die2 = (int) (Math.random() * 6) + 1; // rolling 2nd dice
            ++rollsCount; // rolls counter
            if (die1 == 1 && die2 == 1)
                break; // go out of the loop as soon as we get Snake Eyes
        }
        System.out.println("We got a Snake Eye in " + rollsCount + " rolls");
    }
}