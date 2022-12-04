import java.util.*;

public class InsertionSort {

    // Function to sort an array using insertion sort
    public static void sort(int[] array) {
        // Iterate over the array and insert each element into its correct position in the sorted array
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            // Shift the elements in the sorted array to the right until the correct position for the current element is found
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert the current element into its correct position in the sorted array
            array[j + 1] = current;
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3, 9, 4, 6, 7};

        sort(array);

        // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(array));
    }
}
