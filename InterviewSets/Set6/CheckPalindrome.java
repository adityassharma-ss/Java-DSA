import java.util.*;
public class CheckPalindrome{
    public static void main(String[] args) {
        String s = new String();
        System.out.println(isPalindrome(s("abba")));
}
    private static String s(String string) {
        return null;
    }
    
    public static boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}