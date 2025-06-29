package PracticePackage;

import java.util.Arrays;

public class ThreeSumClosest {

    public int solveMe(int[] nums, int target){
        int currentSum=0;
        int closestSum=nums[0] + nums[1] + nums[2];;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                currentSum = nums[i]+nums[left]+nums[right];
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        int[] ar = {-1,2,1,-4};
        new ThreeSumClosest().solveMe(ar,1);
    }
}
