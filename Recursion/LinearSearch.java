import java.util.*;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4 , 5, 6, 7, 8, 9, 10};
        System.out.println(linearSearch(arr, 5, 0));
        System.out.println(linearSearch2(arr, 5, 0));
        System.out.println(linearSearch3(arr, 5, arr.length-1));
        findAllIndex(arr, 4, 0);
        System.out.println(list);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
        System.out.println(ans);
//        System.out.println(list);
        
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

    // for Multiple Occurrences

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
    
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }
}

