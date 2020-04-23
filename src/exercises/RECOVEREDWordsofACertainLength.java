package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RECOVEREDWordsofACertainLength {

    public static void main(String[] args) {

//        ArrayList<String> words = new ArrayList<>(
//                List.of("apple", "banana", "cucumber", "dessert", "edible", "fridge", "giant", "hello"));


        String firstSentence = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String str[] = firstSentence.split(" ");
        List<String> words2 = new ArrayList();
        words2 = Arrays.asList(str);


        Scanner input = new Scanner(System.in);
        System.out.println("How many letters you want to look for?");
        int letterCount = input.nextInt();

        for (String word : words2) {
            if (word.length() == letterCount) System.out.println(word);
        }
    }
}
