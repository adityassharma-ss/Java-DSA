import java.util.*;

public class PositionOfRightMostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 0;
        int mask = 1;
        while((n & mask) == 0) {
            pos++;
            mask = mask << 1;
        }
        System.out.println(pos);
    }
    
}