package PracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum2SortedArray {

    public int[] solveMe(int[] num, int target){
        int left=0;
        int right=num.length-1;
        int[] ar = new int[2];

            while(left<right){
                if(num[left]+num[right]>target){
                    right--;
                } else if(num[left]+num[right]<target){
                    left++;
                } else if(num[left]+num[right]==target){
                    ar[0]=left+1;
                    ar[1]=right+1;
                    break;
                }
            }
        System.out.println(Arrays.toString(ar));
        return ar;
    }

    public static void main(String[] args) {
        int[] ar = {2,7,11,15};
        new TwoSum2SortedArray().solveMe(ar,9);
    }
}
