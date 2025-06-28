package PracticePackage;

import java.util.HashSet;
import java.util.Set;

public class longestSubsctiringLC3 {

    public int checkMe(String s) {
        int left=0;
        int right=0;
        int maxLength=0;
        Set<Character> set = new HashSet();

        while(right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength,right-left+1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(maxLength);
        return maxLength;
    }
    public static void main(String[] args) {
        new longestSubsctiringLC3().checkMe("abcabcbb");
    }
}
