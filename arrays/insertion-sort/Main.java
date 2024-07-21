import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
         int[] arr={2,4,1,8,6,9};
         int n= arr.length;
        for(int i=0;i<n-1;i++){
            int j=i+1;
            while(j>0 && arr[j-1]>arr[j]){
                int temp =arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
