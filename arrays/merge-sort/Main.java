import java.util.Arrays;

public class MergeSort {
  
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1, 7};
        
        // Call mergesort to sort the array
        mergesort(arr, 0, arr.length - 1);
        
        // Print the sorted array
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    // Method to perform MergeSort
    public static void mergesort(int[] arr, int beg, int end) {
        if (beg < end) {
            // Find the midpoint of the array
            int mid = (beg + end) / 2;
            
            // Recursively apply MergeSort to the left half
            mergesort(arr, beg, mid);
            
            // Recursively apply MergeSort to the right half
            mergesort(arr, mid + 1, end);
            
            // Merge the two halves
            merge(arr, beg, mid, end);
        }
    }

    // Method to merge two halves of the array
    public static void merge(int[] arr, int beg, int mid, int end) {
        int i, j, k;
        
        // Sizes of the two subarrays to be merged
        int n1 = mid - beg + 1;
        int n2 = end - mid;
        
        // Create temporary arrays for the left and right halves
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        // Copy data to temporary arrays
        for (int a = 0; a < n1; a++) {
            left[a] = arr[beg + a];
        }
        for (int a = 0; a < n2; a++) {
            right[a] = arr[mid + a + 1];
        }
        
        // Initial indexes of the left, right, and merged subarrays
        i = 0;
        j = 0;
        k = beg;
        
        // Merge the temporary arrays back into the original array
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        // Copy any remaining elements of the left subarray
        while (i < n1) {
            arr[k++] = left[i++];
        }
        
        // Copy any remaining elements of the right subarray
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }
}
