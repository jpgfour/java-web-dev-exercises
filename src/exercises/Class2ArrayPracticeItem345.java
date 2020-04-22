package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Class2ArrayPracticeItem345 {

    public static void main(String[] args) {

        String seuss = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] seussSplit = seuss.split("\\. ",-2);

        //System.out.println(seussSplit[0]);
        //System.out.println(seussSplit);
        System.out.println(Arrays.toString(seussSplit));

    }
}
