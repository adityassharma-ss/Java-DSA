import java.util.*;
public class DecreaseAndConquer {

    // Function to find the maximum element in an array
    public static int findMax(int[] array) {
        // If the array has only one element, return that element
        if (array.length == 1) {
            return array[0];
        }

        // Divide the array in half and find the maximum element in each half
        int mid = array.length / 2;
        int max1 = findMax(Arrays.copyOfRange(array, 0, mid));
        int max2 = findMax(Arrays.copyOfRange(array, mid, array.length));

        // Return the maximum of the two maximum elements
        return Math.max(max1, max2);
    }

    // Example usage
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3, 9, 4, 6, 7};

        int max = findMax(array);

        // Output: 9
        System.out.println(max);
    }
}