package CodePackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int distinctAverages(int[] nums) {
        int[] sortedAr = sortArray(nums);
        int left = 0;
        int right = sortedAr.length-1;
        float avg=0;

        System.out.println(Arrays.toString(sortedAr));
        Set set = new HashSet();
        while(left<right){
            avg  = (sortedAr[left]+sortedAr[right])/2.0f;
            System.out.println(avg);
            set.add(avg);
            left++;
            right--;
        }
        System.out.println("setSize "+set.size());
        return set.size();
    }

    public int[] sortArray(int ar[]){
        int temp=0;
        for(int j=0;j<ar.length;j++){
            for(int i=0;i<ar.length-1;i++){
                if(ar[i]>ar[i+1]){
                    temp = ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=temp;
                }
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        int[] ar = {9,5,7,8,7,9,8,2,0,7};
        new Solution().distinctAverages(ar);
    }
}
