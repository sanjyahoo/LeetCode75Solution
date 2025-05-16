package CodePackage;

import java.util.ArrayList;
import java.util.List;

public class CommonDivisorString {

    public static void gcdOfStrings(String s1, String s2){

        List indices = new ArrayList();
        int x = s2.indexOf(s1);

        while(x>=0){
            indices.add(x);
            x = s2.indexOf(s2, x+1);

        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        gcdOfStrings("ABAB", "AB");
    }
}
