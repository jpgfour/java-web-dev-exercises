package exercises;

import java.util.ArrayList;

public class RECOVEREDSumthing {

    public static Integer onlyOddsSum(ArrayList<Integer> integers) {
        int sum = 0;

        for( Integer j : integers) {
            if (integers.get(j) % 2 == 0) sum += integers.get(j);
        }
        return sum;
    }
}
