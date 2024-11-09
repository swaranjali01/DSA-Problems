package Array;
public class BinarySearch {

    public static boolean contains(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;  

            if (arr[mid] == k) {
                return true;  
            } else if (arr[mid] < k) {
                left = mid + 1;  
            } else {
                right = mid - 1;  
            }
        }

        return false;  
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};  
        int k = 8;  

        System.out.println("Is " + k + " present in the array? " + contains(arr, k));
    }
}
