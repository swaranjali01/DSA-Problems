package Array;

public class SingleNumber {

    public static int findSingleNumber(int[] nums) {
        int single = 0;

        for (int num : nums) {
            single ^= num; 
        }

        return single;
    }

}

