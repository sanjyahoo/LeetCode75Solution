package PracticePackage;

import java.util.HashMap;
import java.util.Map;

class UniqueCharIndex {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map = new HashMap();
        char[] chars= s.toCharArray();
        for(char x: chars){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            } else{
                map.put(x,1);
            }
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }

        return -1;
    }
}
