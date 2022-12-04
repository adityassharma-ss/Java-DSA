import java.util.*; // Binary Search

public class ElementInRotatedSortedArray {
    public int search(int[] nums, int target) {
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

    public static void main(String[] args) {
        ElementInRotatedSortedArray sol = new ElementInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("At index" + " " + sol.search(nums, target));
    }
}
