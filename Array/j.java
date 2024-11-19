package Array;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    public static ArrayList<Integer> findLeaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);

   

        return leaders;
    }

}

