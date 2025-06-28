package PracticePackage;

import java.util.Arrays;

public class RemoveDupesInPlace {

    public int solveMe(int[] ar){
        int pos=1;
        for(int i=1;i<ar.length;i++){
            if(ar[i]!=ar[i-1]){
                ar[pos]=ar[i];
                pos++;
            }
        }
        System.out.println(pos);
        return pos;
    }

    public static void main(String[] args) {
        int[] ar = {1,1,2,2,3,3};
        new RemoveDupesInPlace().solveMe(ar);
    }
}
