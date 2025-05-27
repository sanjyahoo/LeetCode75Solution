package CodePackage;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public List<Integer> solve1(int[] num, int target){
        int left=0;
        int right=num.length-1;
        List<Integer> list = new ArrayList<Integer>();

        while(left<right){
            if(num[left]+num[right]==target){
                list.add(left);
                list.add(right);
                System.out.println(list);
                return list;
            } else if(num[left]+num[right]>target){
                right--;
            } else if(num[left]+num[right]<target){
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int ar[] = {3,2,4};
        new TwoSum().solve1(ar,6);
    }
}
