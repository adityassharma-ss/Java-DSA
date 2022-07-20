import java.io.*;
import java.util.*;

public class array {
    public static void main(String[] args){
        int[] arr;
        arr = new int[5];

        arr[0] = 33;
        arr[1] = 88;
        arr[2] = 77;
        arr[3] = 44;
        arr[4] = 55;
        System.out.println("Array length: " + arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        

    }
    
}
