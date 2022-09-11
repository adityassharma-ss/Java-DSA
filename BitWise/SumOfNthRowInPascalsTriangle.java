import java.util.*;
public class SumOfNthRowInPascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for(int i=1;i<=n;i++) {
            ans = ans * (n - i + 1) / i;
        }
        System.out.println(ans);
    }
    
    
    
}
