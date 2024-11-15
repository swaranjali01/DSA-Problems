package Array;

public class MaxSubarrayScore {

    public static int maxScore(int[] arr) {
        int n = arr.length;
        int maxScore = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               
                int smallest = Integer.MAX_VALUE;
                int secondSmallest = Integer.MAX_VALUE;
            }
        }

        return maxScore;
    }

}

