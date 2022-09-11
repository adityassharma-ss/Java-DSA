import java.util.*;

public class SumofEachRowOfPascalsTriangle {
    static long calculateSum(int n)
    {
        long sum = 0;
        for (int row = 0; row < n; row++) {
            sum = sum + (1 << row);
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        int n = 3;
        System.out.println("Sum of all elements:" + calculateSum(n));
    }
    
}