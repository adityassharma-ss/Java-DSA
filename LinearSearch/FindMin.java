import java.util.*;
import java.io.*;

public class FindMin {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = io.nextInt();
        }
        
        
        // int[] arr = {18, 12, 7, 3, 14, 28};
        System.out.println(min(arr));
    }
    static int min(int[] arr) {
        if(arr.length==0){
            System.out.println("Empty array");
        }
        else{


        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
    return 0;
}


}
