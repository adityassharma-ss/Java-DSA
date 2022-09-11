import java.util.*;

public class SetTheiThBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int mask = 1 << i;
        int ans = n | mask;
        System.out.println(ans);
    }
    
}
