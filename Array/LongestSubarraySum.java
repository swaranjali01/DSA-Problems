package Array;
import java.util.HashMap;

public class LongestSubarraySum {

    public static int longestSubarrayWithSumK(int[] arr, int k) {
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int cumulativeSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            
        }

        return maxLength;
    }

}
