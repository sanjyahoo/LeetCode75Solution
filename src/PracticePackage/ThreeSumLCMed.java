package PracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumLCMed {

    public List<List<Integer>> solveMe(int[] nums){
        List<List<Integer>> listOfLists = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left=i+1;
            int right=nums.length-1;

            while(left<right) {
                if (nums[left] + nums[right] == -nums[i]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    listOfLists.add(list);
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (nums[left] + nums[right] + nums[i] > 0) {
                    right--;
                } else if (nums[left] + nums[right] + nums[i] < 0) {
                    left++;
                }
            }

        }
        System.out.println(listOfLists);
        return listOfLists;
    }

    public static void main(String[] args) {
        int[] ar = {-1,0,1,2,-1,-4};
        new ThreeSumLCMed().solveMe(ar);
    }
}
