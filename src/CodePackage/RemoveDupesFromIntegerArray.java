package CodePackage;

import java.util.Arrays;

public class RemoveDupesFromIntegerArray {
    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[slow]!=nums[fast]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }
    public static void main(String[] args) {
        int[] ar = {1,1,2};
        new RemoveDupesFromIntegerArray().removeDuplicates(ar);
    }
}
