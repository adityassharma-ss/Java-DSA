import java.util.*;
public class ValidParenthesesChecker {
    public static void main(String[] args) {
        String s = "((()))";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        
            
              int low = 0;  // lower bound of valid '(' count
              int high = 0; // upper bound of valid '(' count
          
              for (final char c : s.toCharArray()) {
                switch (c) {
                  case '(':
                    ++low;
                    ++high;
                    break;
                  case ')':
                    low = Math.max(0, --low);
                    --high;
                    break;
                  case '*':
                    low = Math.max(0, --low);
                    ++high;
                    break;
                }
                if (high < 0)
                  return false;
              }
          
              return low == 0;
            }
          }
          
  
