package exercises;

import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the rectangle's length?");
        Double rectangleLength = input.nextDouble();
        System.out.println("Hello, what is the rectangle's width?");
        Double rectangleWidth = input.nextDouble();
        Double rectangleArea = rectangleLength*rectangleWidth;
        System.out.println("Your rectangle's area is " + rectangleArea);

    }

}
