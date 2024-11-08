//Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.
package Array;
public class RotatedSortedArray {

    public static boolean checkIfSortedAndRotated(int[] nums) {
        int n = nums.length;
        int breaks = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                breaks++;
            }
           
            if (breaks > 1) {
                return false;
            }
        }

        return true;  
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};  
        int[] nums2 = {2, 1, 3, 4};     

        System.out.println("Is nums1 sorted and rotated? " + checkIfSortedAndRotated(nums1));
        System.out.println("Is nums2 sorted and rotated? " + checkIfSortedAndRotated(nums2));
    }
}
