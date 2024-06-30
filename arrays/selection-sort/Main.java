import java.util.Arrays;

public class Main {
    // driver code
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11, -1, 0, 0, 11, 11, 234, 36902, -12 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            
            // find the minimum element in the remaining unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap the minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}