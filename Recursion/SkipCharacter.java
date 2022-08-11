public class SkipChar{
    public static void main(String[] args) {
        String up;
        skip("",up="baccdhh");
        
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
}
