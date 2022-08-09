import java.util.Arrays;
import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5};
        selection(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {

            if (arr[c] > arr[c+1]) {
                // swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            selection(arr, r, c+1);
        } else {
            selection(arr, r-1, 0);
        }
    }
    
}
