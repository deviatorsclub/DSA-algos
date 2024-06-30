import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 5, 61, 65, 123, 4,61, -1 , 6, -1, 234, -12 };
    bubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  
  static void bubbleSort(int[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      // swapped variable to check if swapping happens or not
      // for optimization
      boolean swapped = false;
      for (int j = 0; j < n - i - 1; j++) {
        // swap if the current element is greater than the next element
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

          swapped = true;
        }
      }

      if (!swapped) break;
    }
  }
}
