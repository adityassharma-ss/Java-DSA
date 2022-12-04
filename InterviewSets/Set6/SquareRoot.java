import java.util.*;
public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(5));
    }
    public static long sqrt(int x) {
        if(x == 0){
            return 0;
        }
        long start = 1;
        long end = x;
        while(true){
            long mid = start + (end - start) / 2;
            if(mid > x / mid){
                end = mid - 1;
            }else{
                if(mid + 1 > x / (mid + 1)){
                    return mid;
                }
                start = mid + 1;
            }
        }
    }
    
}
