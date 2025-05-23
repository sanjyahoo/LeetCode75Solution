package CodePackage;

public class removeElementArrangeArray {
    public int removeElement(int[] nums, int val){
        int count=0;
        int slow=0;
        for(int fast=0;fast<nums.length-1;fast++){
            if(nums[slow]!=val){
                slow++;
                count++;
            } else{
                nums[slow]=nums[fast];
                fast++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        int[] ar = {3,2,2,3};
        new removeElementArrangeArray().removeElement(ar,3);
    }
}
