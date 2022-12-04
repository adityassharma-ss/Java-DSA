import java.util.*;  
import java.io.*; 

// rotation count for sorted array
  
public class CountRotations 
{  
    public static int countRotations(int arr[], int n) 
    { 
        int min = arr[0], min_index = 0; 
        for (int i = 0; i < n; i++) 
        { 
            if (min > arr[i]) 
            { 
                min = arr[i]; 
                min_index = i; 
            } 
        }  
        return min_index; 
    } 
  
    // Driver program to test above functions 
    public static void main (String[] args)  
    { 
        int arr[] = {5,1,2,3,4}; 
        int n = arr.length; 
      
        System.out.println(countRotations(arr, n)); 
    } 
}