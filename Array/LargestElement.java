//Given an array arr[]. The task is to find the largest element and return it
package Array;

public class LargestElement {
    public static int findLargest(int[] arr) {
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 40, 30};
        int largest = findLargest(arr);
        System.out.println("The largest element in the array is: " + largest);
    }
}