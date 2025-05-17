package CodePackage;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringPallindrome {

    public void checkMe(String s){
        List<String> list = new ArrayList();
        for(int i=0;i<s.length();i++){
            list.addAll(expandCenter(s,i,i));
            list.addAll(expandCenter(s,i,i+1));
        }

        String max = list.get(0);
        for(int i=0;i<list.size();i++){
            if(list.get(i).length()>max.length()){
                max=list.get(i);
            }
        }
        System.out.println(max);
    }

    public List expandCenter(String s, int left, int right){
        List list  = new ArrayList<>();
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            list.add(s.substring(left,right+1));
            left--;
            right++;
        }
        return list;
    }
    public static void main(String[] args) {
        LongestSubstringPallindrome ob = new LongestSubstringPallindrome();
        ob.checkMe("aaa");
    }
}
