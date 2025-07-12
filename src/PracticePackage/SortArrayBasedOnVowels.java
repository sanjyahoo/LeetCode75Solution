package PracticePackage;

import java.util.*;
//Adobe interview
public class SortArrayBasedOnVowels {

    public String[] solveMe(String[] ar){
        HashMap<String, Integer> map = new HashMap<>();
        for(String country: ar){
            int count=0;
            for(char c: country.toCharArray()){
                if("aeiouAEIOU".indexOf(c)!=-1){
                    count++;
                }
            }
            map.put(country,count);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        String[] result = new String[ar.length];
        int i = 0;
        for (Map.Entry<String, Integer> entry : list) {
            result[i++] = entry.getKey();
        }

        System.out.println(Arrays.toString(result));
        return result;
    }

    public static void main(String[] args) {
        String[] ar = {"India", "australia", "japan", "srilanka", "nepal", "USA"};
        new SortArrayBasedOnVowels().solveMe(ar);
    }
}
