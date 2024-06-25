public class Main {
  // driver code
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6 ,7 ,8 ,9, 10};
    int target = 5;
    int index = linearSearch(arr, target);
    System.out.println(index);
  }

  static int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;    // if target not present return -1
  }
}
