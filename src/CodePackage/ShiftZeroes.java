package CodePackage;

import java.util.Arrays;

public class ShiftZeroes {

    public void shiftMe(int[] ar){

        int n = ar.length-1;
        int writeIndex = n-1;

        for(int i=n-1;i>=0;i--){
            if(ar[i]!=0){
                ar[writeIndex]=ar[i];
                writeIndex--;
            }
        }

        while(writeIndex>=0){
            ar[writeIndex]=0;
            writeIndex--;
        }

        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {
        int[] ar = {1,2,3,5,0,0,9,8,0,8,7,8,0,0,9,8};
        new ShiftZeroes().shiftMe(ar);
    }
}
