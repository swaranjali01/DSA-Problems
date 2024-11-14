package Array;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
       
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, -1, 2, 1, -5}; 
        System.out.println("Maximum subarray sum: " + maxSubArray(nums));
    }
}
