package Firstsubroutines;

import textio.TextIO;

public class Firstsubroutines {

    public static void main(String[] args) {  // This program gets a line and checks if it is a palindrome.

        System.out.println("How about some palindrome check?");
        System.out.print("Enter a line here: ");
        String lineToCheck = TextIO.getln();  // get input...
        lineToCheck = lineToCheck.toLowerCase();  // change the word to lower case...

        System.out.println("Stripped: " + onlyLetters(lineToCheck));
        System.out.println("Reversed: " + reverse(onlyLetters(lineToCheck)));

        if ((onlyLetters(lineToCheck)).equals(reverse(onlyLetters(lineToCheck)))) {  // Check if the line is a palindrome...
            System.out.println("Yay! It's a palindrome!");
        } else {
            System.out.println("Hate to break it to you, but this is not a palindrome :(");
        }

    }

    private static String reverse(String str) {  // The first subroutine to compute a reverse value of a string entered

        String reverse = "";
        int i;

        for (i = str.length() - 1; i >= 0; i--)
            reverse += str.charAt(i);
        return reverse;
    }

    private static String onlyLetters(String str) {  // The 2nd subroutine to get rid of non-letters

        String stripLine = "";
        int i;

       for (i = 0; i < str.length(); i++)
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                stripLine += str.charAt(i);

        return stripLine;
    }

}