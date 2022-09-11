import java.util.*;

public class FindSetBitsForANumberN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        while(n > 0) {
            ans += (n & 1);
            n = n >> 1;
        }
        System.out.println(ans);
    }
    
    
}
