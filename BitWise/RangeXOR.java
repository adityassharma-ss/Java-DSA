import java.util.*;

public class RangeXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TLE will exceed for large values of n by this approach
        int l = sc.nextInt();
        int r = sc.nextInt();
        int ans = 0;
        for(int i=l;i<=r;i++) {
            ans ^= i;
        }
        System.out.println(ans);

        int a = 3;
        int b = 9;
        int ans2 = xor(b) ^ xor(a - 1);
        System.out.println(ans2);
    }

    // Appoach 2: Using the fact that XOR of numbers from 0 to n is n if n is even and 1 if n is odd

    public static int xor(int n) {
        if(n % 4 == 0) {
            return n;
        } else if(n % 4 == 1) {
            return 1;
        } else if(n % 4 == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }

    

    
}
