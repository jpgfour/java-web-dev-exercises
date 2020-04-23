package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class Charactercount {

    public static void main(String[] args) {
        String movieQuote = "If the product of two terms is zero then common sense says at least one of the " +
                "two terms has to be zero to start with. So if you move all the terms over to one side, you can " +
                "put the quadratics into a form that can be factored allowing that side of the equation to equal " +
                "zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charactersInString = movieQuote.toCharArray();
        HashMap<Character,Integer> count = new HashMap<>();
        int currentCount = 0;

        //System.out.println(charactersInString);

        for (char character : charactersInString) {
            //loop through character array
            //is character a key?
            //if so, find out where that key is and +1 on that value
            //if not, add key, +1 on that value
            //add up character count

            if(count.containsKey(character)){
                //increment +1
                currentCount = count.get(character);
                count.replace(character, currentCount + 1);
            }else{
                count.put(character,1);
            }


        }

        //print out the list of counts
        for (Map.Entry<Character,Integer> line : count.entrySet()) {
            System.out.println(line.getKey() + " " + line.getValue());
        }
    }
}
