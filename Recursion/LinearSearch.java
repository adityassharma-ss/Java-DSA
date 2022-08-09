public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(linearSearch(arr, 5, 0));
        System.out.println(linearSearch2(arr, 5, 0));
        System.out.println(linearSearch3(arr, 5, arr.length-1));
        
    }

    static boolean linearSearch(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || linearSearch(arr, target, index + 1);
    }

    static int linearSearch2(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return linearSearch2(arr, target, index + 1);
        }
    }

    static int linearSearch3(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return linearSearch3(arr, target, index - 1);
        }
    }
    
}
