package CodePackage;

import java.util.Arrays;

public class ShiftZeroesToRight {

    public void shiftToTheRight(int[] ar){
        int n = ar.length;
        int writeIndex = 0;

        for(int i=0;i<n;i++){
            if(ar[i]!=0){
                ar[writeIndex]=ar[i];
                writeIndex++;
            }
        }
        while(writeIndex<ar.length){
            ar[writeIndex]=0;
            writeIndex++;
        }

        System.out.println(Arrays.toString(ar));
    }

    public static void main(String[] args) {
        int[] ar = {1,0,9,0,8,9,0,8};
        new ShiftZeroesToRight().shiftToTheRight(ar);
    }
}
