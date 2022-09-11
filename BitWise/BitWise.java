import java.util.*;
public class BitWise {
    public static void main(String[] args) {
        int n=0;
        int b =45;
        System.out.println((n&1));
        System.out.println((n|1));
        System.out.println((n^1));
        System.out.println((n<<1));
        System.out.println((n>>1));
        System.out.println((n>>>1));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(setBits(b));


    }

    public static int setBits(int b) {
        int ans = 0;
        while(b > 0) {
            ans += (b & 1);
            b = b >> 1;
        }
        return ans;
    } 
}
