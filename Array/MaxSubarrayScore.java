package Array;

public class MaxSubarrayScore {

    public static int maxScore(int[] arr) {
        int n = arr.length;
        int maxScore = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
               
                int smallest = Integer.MAX_VALUE;
                int secondSmallest = Integer.MAX_VALUE;

                for (int k = i; k <= j; k++) {
                    if (arr[k] < smallest) {
                        secondSmallest = smallest;
                        smallest = arr[k];
                    } else if (arr[k] < secondSmallest) {
                        secondSmallest = arr[k];
                    }
                }
               
                int score = smallest + secondSmallest;

                maxScore = Math.max(maxScore, score);
            }
        }

        return maxScore;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 1, 4};  
        System.out.println("Maximum score: " + maxScore(arr));
    }
}

