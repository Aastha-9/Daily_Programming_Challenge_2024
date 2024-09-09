import java.util.*;
public class SortArrayDay1{
    public static void sort012(int[] arr) {
        int low=0,mid=0,high=arr.length-1;
        while (mid<=high) {
            switch (arr[mid]) {
                case 0:
                    int temp0=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2=arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=temp2;
                    high--;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,1,0,2,1,0,2};
        sort012(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
