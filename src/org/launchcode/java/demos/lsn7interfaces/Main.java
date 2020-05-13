package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        Comparator comparator = new FlavorComparator();
        Comparator comparator2 = new ConeComparator();
        Comparator comparator3 = new ToppingComparator();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        //test before sort
//        for (Flavor flavor : flavors) {
//            System.out.println(flavor.getName());
//        }
        flavors.sort(comparator);
        //test after sort
//        for (Flavor flavor : flavors) {
//            System.out.println(flavor.getName());
//        }
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        cones.sort(comparator2);
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName() + ": $" + flavor.getCost() + " Allergen Count: " + flavor.getAllergens().size());
        }
        System.out.println("***************");
        for (Cone cone : cones) {
            System.out.println(cone.getName() + ": $" + cone.getCost());
        }
        //BONUS TOPPINGS SORTED BY NAME
        System.out.println("***************");
        toppings.sort(comparator3);
        for (Topping topping : toppings) {
            System.out.println(topping.getName() + ": $" + topping.getCost() + " Allergen Count: " + topping.getAllergens().size());
        }
    }
}
