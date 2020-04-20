package exercises;

import java.util.Scanner;

public class AAIW {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstSentence = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("Hello, what's your search term?");
        String searchTerm = input.nextLine();

        if (firstSentence.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println("Your search term was found!  It occurs at index " + firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase()) + " of Alice's first sentence.  It has " + searchTerm.length() + " characters.");
            String before = firstSentence.substring(0, firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase()));
            String after = firstSentence.substring(firstSentence.toLowerCase().indexOf(searchTerm.toLowerCase()) + searchTerm.length());
            System.out.println(before + after);
//            String[] twoPieces = firstSentence.split(searchTerm.toLowerCase());
//            System.out.println(twoPieces[0] /*+ twoPieces[1]*/);
//            String missingSomething = twoPieces[0].concat(twoPieces[1]);
//            System.out.println(missingSomething);
        } else {
            System.out.println("Your search term was NOT found...");
        }

    }

}
