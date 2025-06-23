package PracticePackage;

import java.util.HashMap;

public class RomanToInteger {
    public void solveMe(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int num=0;
        for(int i=0;i<s.length();i++){
            int current = map.get(s.charAt(i));

            if(i+1<s.length()){
                int next = map.get(s.charAt(i+1));
                if(current<next){
                    num-=current;
                    continue;
                }
            }
            num+=current;
        }

        System.out.println(num);


    }
    public static void main(String[] args) {
        new RomanToInteger().solveMe("IX");
    }
}
