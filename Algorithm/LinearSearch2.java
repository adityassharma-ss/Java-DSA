import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = io.nextInt();
        }
        int target = io.nextInt();

        int ans = LinearSearch(a, target);
        System.out.println("Target is at index: " + ans);

    }
    static int LinearSearch(int[] a,int target){
        if(a.length==0){
            return -1;
        }
        for(int i=0;i<a.length;i++){
            int element = a[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    
    }
    
}
