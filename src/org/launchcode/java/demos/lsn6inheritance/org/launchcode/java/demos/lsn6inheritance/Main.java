package org.launchcode.java.demos.lsn6inheritance;

public class Main {


    public static void main(String[] args) {

        //things designed to fail to prove a point
        //HouseCat mittens = new HouseCat(8.4);
        //Cat salem = new Cat(8);

        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        Cat salem = new Cat(8);
        System.out.println(salem.getWeight());

        HouseCat victoria = new HouseCat("Victoria");
        System.out.println(victoria.getWeight());

    }
}