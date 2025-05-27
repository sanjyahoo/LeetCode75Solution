package CodePackage;

import java.util.Arrays;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        if(nums1.length==0 || nums2.length==0){
            System.out.println(nums1);
        } else {
            for(int i=nums1.length-1;i>=m;i--){
                nums1[i]=nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;

        int[] nums2 = {2,5,6};
        int n = 3;
        new MergeSortedArrays().merge(nums1,m,nums2,n);
    }
}
