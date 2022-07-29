import java.util.*;

public class SearchInRotatedSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(search(nums,n,target));

    }

        public static int search(int[] nums, int n, int target) {
            int l = 0;
        int r = nums.length - 1;
    
        while (l <= r) {
          final int m = l+(r-l) / 2;
          if (nums[m] == target)
            return m;
          if (nums[l] <= nums[m]) { // nums[l..m] are sorted
            if (nums[l] <= target && target < nums[m])
              r = m - 1;
            else
              l = m + 1;
          } else { // nums[m..n - 1] are sorted
            if (nums[m] < target && target <= nums[r])
              l = m + 1;
            else
              r = m - 1;
          }
        }
    
        return -1;
            
        }
    }

