package CodePackage;

import java.util.Arrays;

public class ReverseStringTwo {
    public String reverseStr(String s, int k) {
        String s1 = s.substring(0,2);
        int left=0;
        int right=s1.length()-1;
        char[] s2= s1.toCharArray();

        while(left<right){
            char temp = s1.charAt(left);
            s2[left]=s2[right];
            s2[right]=temp;
            left++;
            right--;
        }

        String finalString =String.valueOf(s2)+s.substring(2,s.length()-1);
        return finalString;

    }

    public static void main(String[] args) {
        new ReverseStringTwo().reverseStr("abcdefg",2);
    }
}
