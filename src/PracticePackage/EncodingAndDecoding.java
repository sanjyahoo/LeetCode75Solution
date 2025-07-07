package PracticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodingAndDecoding {
    public String encode(List<String> list){
        StringBuilder sb = new StringBuilder();
        for(String s: list){
            sb.append(s.length()+"#"+s);
        }

        return sb.toString();
    }

    public void decodeString(String s){
        
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("neet");
        list.add("code");
        list.add("love");
        list.add("you");
        new EncodingAndDecoding().encode(list);
    }
}
