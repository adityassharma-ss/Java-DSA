import java.util.*;


public class LinSearch2Darray {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < m; col++) {
        arr[row][col] = scn.nextInt();
      }
    }
    int data = scn.nextInt();
    scn.close();

    for (int row = 0; row < n; row++) {
      for (int col = 0; col < m; col++) {
        if (arr[row][col] == data) {
          System.out.println( row );
          System.out.println( col );
          return;
        }
      }
    }
    System.out.println("Not Found");
  }
}