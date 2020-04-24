package org.launchcode.java.studios.countingcharacters;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.Files.readString;

public class Charactercount {

    public static void main(String[] args) throws IOException {
//        String movieQuote = "If the product of two terms is zero then common sense says at least one of the " +
//                "two terms has to be zero to start with. So if you move all the terms over to one side, you can " +
//                "put the quadratics into a form that can be factored allowing that side of the equation to equal " +
//                "zero. Once you’ve done that, it’s pretty straightforward from there.";

//        char[] charactersInString = movieQuote.toCharArray();
//        HashMap<Character,Integer> count = new HashMap<>();


        Path filePath = Paths.get("C:/", "temp", "MadamImAdam.txt");
        String content = readString(filePath, StandardCharsets.US_ASCII).toLowerCase();


        System.out.println("Please enter the quote you'd like analyzed: ");
        Scanner input = new Scanner(System.in);

        String userQuote = input.nextLine().toLowerCase();
        //char[] userCharacters = userQuote.toCharArray();
        //hijacking userCharacters!!! user input from line 30 will get overwritten by file contents
        char[] userCharacters = content.toCharArray();
        HashMap<Character,Integer> userCount = new HashMap<>();

        ArrayList<Character> alphaNumeric = new ArrayList<Character>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9'));
        int currentCount = 0;

        for (char character : userCharacters) {
            //loop through character array
            //is character a key?
            //if so, find out where that key is and +1 on that value
            //if not, add key, +1 on that value
            //add up character count

            if(alphaNumeric.contains(character)) {

                if (userCount.containsKey(character)) {
                    //increment +1
                    currentCount = userCount.get(character);
                    userCount.replace(character, currentCount + 1);
                } else {
                    userCount.put(character, 1);
                }
            }

        }

        //print out the list of counts
        for (Map.Entry<Character,Integer> line : userCount.entrySet()) {
            System.out.println(line.getKey() + " " + line.getValue());
        }
    }
}
