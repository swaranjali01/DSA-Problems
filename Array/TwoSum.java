package Array;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();  
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];  

          
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i}; 
            }

            
            map.put(nums[i], i);
        }

       
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};  
        int target = 9;  
        int[] result = twoSum(nums, target);

        System.out.println("Indices of the two numbers that add up to target: [" + result[0] + ", " + result[1] + "]");
    }
}

