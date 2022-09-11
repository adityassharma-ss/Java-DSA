import java.util.*;
public class FindUniqueElement{
    public static void main(String[] args)
    {
        int a[] = { 6, 2, 5, 2, 2, 6, 6 };
        int n = a.length;
        int k = 3;
        System.out.println(findUnique(a, n, k));
    }

    public static int findUnique(int a[], int n, int k)
    {
        int ans = 0;
        for(int i=0;i<32;i++)
        {
            int sum = 0;
            for(int j=0;j<n;j++)
            {
                if((a[j] & (1<<i)) != 0)
                {
                    sum++;
                }
            }
            if(sum % k != 0)
            {
                ans += (1<<i);
            }
        }
        return ans;
    }
}