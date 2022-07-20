import java.io.*;
import java.util.*;

public class memoryallocarray {
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = arr[i];
  }
  public static void main(String[] args) {
    int[] arr;
    arr = new int[5];
    arr[0] = 13;
    arr[1] = 27;
    arr[2] = 69;
    arr[3] = 65;
    arr[4] = 558;

    swap(arr, 0, 4);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}