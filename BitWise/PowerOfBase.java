import java.util.*;

public class PowerOfBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(); // power
        int b = sc.nextInt(); // base
        int ans = 1;
        while(p > 0) {
            int lastBit = p & 1;
            if(lastBit == 1) {
                ans *= b;
            }
            b *= b;
            p = p >> 1;
        }
        System.out.println(ans);
    }
    
    
}
