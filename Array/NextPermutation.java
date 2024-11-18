package Array;

import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) { 
  
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
           
            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

   

  

  
}
