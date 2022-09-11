import java.util.*;
public class NumberOfDigitsInBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        
        System.out.println(ans);

        // int n = 2;
        // int b = 10;

        // int ans = (int)(Math.log(n) / Math.log(b)) + 1;
        // System.out.println(ans);
    }

    
    
}
