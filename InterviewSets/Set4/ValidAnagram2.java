// Approach: Sort both the string and compare each and every letter of both strings. If all letters matched then, print true. Otherwise, print false.


import java.util.*;
public class ValidAnagram2 {
    public static String SortString(String str)
  {
    char c[] = str.toCharArray();
    Arrays.sort(c);
    return new String(c);
  }
public static boolean checkAnagrams(String str1, String str2)
  {
    // Case 1: when both of the strings have different lengths
    if (str1.length() != str2.length())
      return false;
 
    str1 = SortString(str1);
    str2 = SortString(str2);
 
    // Case 2: check if every character of str1 and str2 matches with each other
    for (int i = 0; i < str1.length(); i++)
    {
      if (str1.charAt(i) != str2.charAt(i))
        return false;
    }
    return true;
  }
public static void main(String args[])
  {
    String Str1 = "INTEGER";
    String Str2 = "TEGERNI";
    System.out.println(checkAnagrams(Str1, Str2));
  }
    
}
