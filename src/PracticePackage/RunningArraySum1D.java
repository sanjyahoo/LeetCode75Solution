package PracticePackage;

import java.util.Arrays;

public class RunningArraySum1D {
    public void checkMe(int ar[]){
        int prevSum=0;
        for(int i=1;i<ar.length;i++){
            prevSum=ar[i]+ar[i-1];
            ar[i]=prevSum;
        }
        System.out.println(Arrays.toString(ar));
    }
    public static void main(String[] args) {
        int[] ar = {1, 1, 1, 1};
        new RunningArraySum1D().checkMe(ar);
    }
}
