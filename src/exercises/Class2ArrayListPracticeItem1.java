package exercises;

import java.util.ArrayList;

public class Class2ArrayListPracticeItem1 {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i< 10; i++) {
            integers.add(i);
        }


        //move below to separate method
//        int sum = 0;
//
//        for( Integer j: integers) {
//            if (integers.get(j) % 2 == 0) {
//                sum += integers.get(j);
//            }
//        }

        //code method call here
        System.out.println(Sumthing.onlyOddsSum(integers));
    }
}
