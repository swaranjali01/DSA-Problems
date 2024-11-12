package Array;
import java.util.HashMap;

public class LongestSubarraySum {

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int cumulativeSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            if (cumulativeSum == k) {
                maxLength = i + 1;
            }

            if (sumIndexMap.containsKey(cumulativeSum - k)) {
                maxLength = Math.max(maxLength, i - sumIndexMap.get(cumulativeSum - k));
            }

            
            if (!sumIndexMap.containsKey(cumulativeSum)) {
                sumIndexMap.put(cumulativeSum, i);
            }
        }

        return maxLength;
    }

}
