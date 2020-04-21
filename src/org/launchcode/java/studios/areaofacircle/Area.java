package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number as a radius:");

        if (!input.hasNextDouble()) {
            System.out.println("That's not a number.");
        } else {
            Double radius = input.nextDouble();
            while (radius < 0 ) {
                    System.out.println("Please enter a POSITIVE number, this isn't the Negaverse.");
                    radius = input.nextDouble();
                }

            Double area = Circle.getArea(radius);
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
            }

        }

    }



