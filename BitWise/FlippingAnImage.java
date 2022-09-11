import java.util.*;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            // reversing array
            for(int i=0;i<(image[0].length+1)/2;i++){
                // swap
                
                int temp = row[i]^1;
                row[i] = row[image[0].length-i-1]^1;
                 row[image[0].length-i-1] = temp;
            }
     
        }
        return image;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        FlippingAnImage obj = new FlippingAnImage();
        int[][] ans = obj.flipAndInvertImage(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
}
