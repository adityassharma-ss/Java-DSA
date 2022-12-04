import java.util.*;
public class QuickSort {

    // Helper function to partition the array around the pivot element
    public static int partition(int[] array, int start, int end) {
        // Choose the pivot element as the last element in the array
        int pivot = array[end];

        // Keep track of the pivot index
        int pivotIndex = start;

        // Iterate over the array and partition the elements
        for (int i = start; i < end; i++) {
            // If the current element is less than the pivot element, swap it with the element at the pivot index
            if (array[i] < pivot) {
                int temp = array[i];
                array[i] = array[pivotIndex];
                array[pivotIndex] = temp;

                // Increment the pivot index
                pivotIndex++;
            }
        }

        // Swap the pivot element with the element at the pivot index
        int temp = array[pivotIndex];
        array[pivotIndex] = array[end];
        array[end] = temp;

        // Return the pivot index
        return pivotIndex;
    }

    // Recursive function to sort an array using quick sort
    public static void quickSort(int[] array, int start, int end) {
        // If the array has only one element, it is already sorted
        if (start >= end) {
            return;
        }

        // Partition the array around the pivot element
        int pivotIndex = partition(array, start, end);

        // Sort the left and right halves of the array
        quickSort(array, start, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, end);
    }

    // Example usage
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3, 9, 4, 6, 7};

        quickSort(array, 0, array.length - 1);

        // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(array));
    }
}
