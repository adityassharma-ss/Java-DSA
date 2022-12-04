import java.util.*;
public class MissingNumberInAnArray {
    public static void main(String[] args) {
        int[] nums = new int[]{2,5,6,4};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
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
