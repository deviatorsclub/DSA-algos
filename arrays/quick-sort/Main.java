import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1, 7};
        
        // Call quicksort to sort the array
        quicksort(arr, 0, arr.length - 1);
        
        // Print the sorted array
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    // Method to perform QuickSort
    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int idx = partition(arr, low, high);
            
            // Recursively apply QuickSort to the subarrays
            quicksort(arr, low, idx - 1);
            quicksort(arr, idx + 1, high);
        }
    }

    // Method to partition the array
    public static int partition(int[] arr, int low, int high) {
        // Use the first element as the pivot
        int pivot = arr[low];
        int k = high;
        
        // Rearrange the elements around the pivot
        for (int i = high; i > low; i--) {
            if (arr[i] > pivot) {
                // Swap arr[i] with arr[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
        
        // Swap the pivot element with arr[k]
        int temp = arr[low];
        arr[low] = arr[k];
        arr[k] = temp;
        
        // Return the pivot index
        return k;
    }
}
