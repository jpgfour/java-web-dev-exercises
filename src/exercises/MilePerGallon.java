package exercises;

import java.util.Scanner;

public class MilePerGallon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Hello, how many miles have you driven?");
        Double miles = input.nextDouble();
        System.out.println("Hello again, how may gallons of gas have you used while driving those miles?");
        Double gallons = input.nextDouble();
        Double mpg = miles/gallons;
        System.out.println("Your car's mpg is " + mpg);

    }

}
