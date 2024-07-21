import java.util.Arrays;

public class mergesort {
  
    public static void main(String[] args) {
        int[] arr = new int[]{5,4,3,2,1,7};
        mergesort(arr,0,arr.length-1);
        for(int a: arr) System.out.print(a);
    }
    public static void mergesort(int[] arr,int beg, int end) {
        if(beg<end) {
            int mid = (beg+end)/2;
            mergesort(arr,beg,mid);
            mergesort(arr,mid+1,end);
            merge(arr,beg,mid,end);
        }
    }
    public static void merge(int[] arr,int beg, int mid, int end) {
        int i,j,k;
        int n1 = mid-beg+1;
        int n2 = end-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int a=0; a<n1; a++)
            left[a] = arr[beg+a];
        for(int a=0; a<n2; a++)
            right[a] = arr[mid+a+1];
        i=0;
        j=0;
        k = beg;
        while(i<n1 && j<n2) {
            if(left[i]<right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        while(i<n1) arr[k++] = left[i++];
        while(j<n2) arr[k++] = right[j++];
    }
}
