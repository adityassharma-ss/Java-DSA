import java.util.*;

public class FindithBitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int mask = 1 << i;
        if((n & mask) == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
    
    
}
