import java.util.*;
public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
        public static boolean isIsomorphic(String s, String t) {
            Map<Character, Integer> charToIndex_s = new HashMap<>();
            Map<Character, Integer> charToIndex_t = new HashMap<>();
        
            for (Integer i = 0; i < s.length(); ++i)
              if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i))
                return false;
        
            return true;
          }
    }

    // public static boolean isIsomorphic(String s, String t) {
    //     if (s.length() != t.length()) {
    //         return false;
    //     }
    //     Map<Character, Character> map = new HashMap<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         char c1 = s.charAt(i);
    //         char c2 = t.charAt(i);
    //         if (map.containsKey(c1)) {
    //             if (map.get(c1) != c2) {
    //                 return false;
    //             }
    //         } else {
    //             if (map.containsValue(c2)) {
    //                 return false;
    //             }
    //             map.put(c1, c2);
    //         }
    //     }
    //     return true;
    // }


    

