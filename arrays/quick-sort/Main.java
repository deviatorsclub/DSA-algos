import java.util.Arrays;
public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1,7};
        quicksort(arr,0,arr.length-1);
        for(int a: arr) System.out.print(a);
    }
    public static void quicksort(int[] arr,int low, int high) {
        if(low<high) {
            int idx = partition(arr,low,high);
            quicksort(arr,low,idx-1);
            quicksort(arr,idx+1,high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int k = high;
        for(int i=high; i>low; i--) {
            if(arr[i]>arr[low]) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
        int temp = arr[low];
        arr[low] = arr[k];
        arr[k] = temp;
        return k;
    }
}
