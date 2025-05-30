package PracticePackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
    public static void main(String[] args) {
        int[] ar = new int[]{3,2,4};
        TwoSum ob = new TwoSum();
        int ab[] = ob.twoSum(ar,6);
        System.out.println(Arrays.toString(ab));

    }
}
