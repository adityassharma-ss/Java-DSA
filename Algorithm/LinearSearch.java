package Algorithm;

import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = io.nextInt();
        }

        int k = io.nextInt();
        for(int i=0;i<n;i++){
            if(k==a[i]){
                System.out.println(k + " Founded at: " + a[i] + " index");
            return;
            }
            
            else{
                System.out.println("Not FOUNDED");
            }

        }
        return;
    }
    
}
