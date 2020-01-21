package SnakeEyesCounter;

public class Main {
    public static void main(String[] args) {
        // declaring the variables
        int die1, die2, snakeEye, rollsCount;
        snakeEye = 0;

        // starting the 1000 loop
        for (rollsCount = 0; rollsCount < 1000; rollsCount++) {
            die1 = (int) (Math.random() * 6) + 1; // rolling 1st dice
            die2 = (int) (Math.random() * 6) + 1; // rolling 2nd dice
            if (die1 == 1 && die2 == 1) {
                snakeEye += 1; // snake eyes counter
            }
        }
        System.out.println("We got " + snakeEye + " snake eyes over " + rollsCount + " rolls, and the average number of rolls to get Snake Eyes is " + rollsCount / snakeEye);
    }
}