import java.util.*;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 2};
        merge(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void merge(int[] arr, int s, int e) {
        if (s == e) {
            return;
        }
        int m = s + (e-s) / 2;
        merge(arr, s, m);
        merge(arr, m+1, e);
        mergeSort(arr, s, m, e);
    }

    public static void mergeSort(int[] arr, int s, int m, int e) {
        int[] temp = new int[e-s+1];
        int i = s;
        int j = m+1;
        int k = 0;
        while (i <= m && j <= e) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= m) {
            temp[k++] = arr[i++];
        }
        while (j <= e) {
            temp[k++] = arr[j++];
        }
        for (int x = 0; x < temp.length; x++) {
            arr[s+x] = temp[x];
        }
    }
    
}
