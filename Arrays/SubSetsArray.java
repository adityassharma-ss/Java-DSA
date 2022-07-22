import java.io.*;

import java.util.*;
public class SubSetsArray
{
  public static void main (String[]args) throws Exception
  {
    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt ();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = scn.nextInt ();
    }
    int limit = (int) Math.pow (2, arr.length); //calculating the number of subsets
    for (int i = 0; i < limit; i++)
    {
      
      String set = "";
      
      int temp = i;
      
      for (int j = arr.length - 1; j >= 0; --j)
      {
        
        int rem = temp % 2;
        temp = temp / 2;
        if (rem == 0)   
        {
          set = "- " + set;
        }
        else
        {
          
          set = arr[j] + " " + set;
        }
      }
      System.out.println (set);
      
    }
  }
}