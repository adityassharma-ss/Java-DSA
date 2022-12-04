import java.util.*;
public class MergeSort {

    // Helper function to merge two sorted arrays
    public static void merge(int[] a, int[] b, int[] result) {
        // Keep track of the current indices in each array
        int aIndex = 0, bIndex = 0;

        // Iterate over the result array and fill it with the sorted elements
        for (int i = 0; i < result.length; i++) {
            // If one of the arrays has been fully merged, fill the remaining elements with the other array
            if (aIndex >= a.length) {
                result[i] = b[bIndex++];
            } else if (bIndex >= b.length) {
                result[i] = a[aIndex++];
            } else if (a[aIndex] < b[bIndex]) {
                // If the current element in a is smaller, add it to the result
                result[i] = a[aIndex++];
            } else {
                // Otherwise, add the current element in b to the result
                result[i] = b[bIndex++];
            }
        }
    }

    // Recursive function to sort an array using merge sort
    public static void mergeSort(int[] array) {
        // If the array has only one element, it is already sorted
        if (array.length <= 1) {
            return;
        }

        // Split the array in half
        int[] a = new int[array.length / 2];
        int[] b = new int[array.length - a.length];
        System.arraycopy(array, 0, a, 0, a.length);
        System.arraycopy(array, a.length, b, 0, b.length);

        // Sort the two halves
        mergeSort(a);
        mergeSort(b);

        // Merge the two sorted halves
        merge(a, b, array);
    }

    // Example usage
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3, 9, 4, 6, 7};

        mergeSort(array);

        // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(array));
    }
}
