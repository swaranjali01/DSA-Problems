
package Array;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  

        reverse(nums, 0, n - 1);

        reverse(nums, 0, k - 1);

        reverse(nums, k, n - 1);
    }

    
    