public class SkipChar{
    public static void main(String[] args) {
        String up;
        skip("",up="baccdhh");
        System.out.println(skip2(up="baccdhh")); 
        
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char c = up.charAt(0);
        if(c == 'a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p + c, up.substring(1));
        }
    }

    static String skip2(String up) {
        if (up.isEmpty()) {
            return ""; // returning empty string
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }
}