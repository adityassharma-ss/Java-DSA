import java.util.*;

public class Minimumlength {
    static int findMinLength(String arr[], int n)
    {
        int min = arr[0].length();

        for (int i = 1; i < n; i++)
        {
            if (arr[i].length() < min)
            {
                min = arr[i].length();
            }
        }

        return (min);
    }

    public static void main(String[] args) {
        String arr[] = { "geeksforgeeks", "geeks", "geek", "geezer", "leetcode", "cat"};
        int n = arr.length;
        System.out.println("The string with minimum length is " + findMinLength(arr, n));
    }
    
}
