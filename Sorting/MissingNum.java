import java.util.*;
import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(missingNumber(nums, n));
    }
    
    public static int missingNumber(int[] nums,int n){
        int i=0;
        while(i< nums.length){
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index] != index){
                return index;
            }
        }
        return nums.length;
        


    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
