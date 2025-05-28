package PracticePackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CharacterCountCheck {

    public boolean checkString(String s){
        Map<Character,Integer> map = new HashMap();
        char[] ch = s.toCharArray();
        for(Character c: ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            } else{
                map.put(c,1);
            }
        }
        Set<Integer> frequencies = new HashSet<>(map.values());
        return frequencies.size() == 1;
    }
    public static void main(String[] args) {
        System.out.println(new CharacterCountCheck().checkString("ababaab"));
    }
}
