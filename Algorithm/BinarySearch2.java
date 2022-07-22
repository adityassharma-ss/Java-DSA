import java.io.*;
import java.util.*;
public class BinarySearch2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int l=0;
        int h= a.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(d>a[m]){
                l = m+1;

            }
            else if(d<a[m]){
                h=m-1;
            }
            else{
                System.out.println(m);
                return;
            }
        }
        System.out.println(-1);

    


    }
    
}
