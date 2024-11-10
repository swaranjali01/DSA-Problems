package Array;

public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;  
        int actualSum = 0;

        
        for (int num : nums) {
            actualSum += num;
        }

       
        return expectedSum - actualSum;
    }

    
}
