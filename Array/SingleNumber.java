package Array;

public class SingleNumber {

    public static int findSingleNumber(int[] nums) {
        int single = 0;

        for (int num : nums) {
            single ^= num; 
        }

        return single;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};  
        System.out.println("Single number: " + findSingleNumber(nums));
    }
}

