import java.util.*;

public class ReplaceArrayWithGreatestInt {
        public static int[] replaceElements(int[] arr) {
            int n =arr.length;
            int max = arr[n-1];
            arr[n-1] = -1;
            for(int i=n-2;i>=0;i--){
                int temp = arr[i];
                arr[i]=max;
                if(max<temp)
                    max= temp;
            }
            return arr;
        }
    
    static void printArray(int arr[])
    {
        for (int i=0; i < arr.length; i++)
        System.out.print(arr[i]+" ");
    }

    public static void main (String[] args)
    {
        int arr[] = {16, 17, 4, 3, 5, 2};
        replaceElements(arr);
        System.out.println("The modified array:");
        printArray (arr);
    }


    
}
