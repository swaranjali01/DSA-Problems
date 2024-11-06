package Array;

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1;  
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 60, 40};  
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest element in the array is: " + secondLargest);
    }
}
