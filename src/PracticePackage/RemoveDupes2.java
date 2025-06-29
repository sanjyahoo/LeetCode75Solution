package PracticePackage;

public class RemoveDupes2 {

    public int solveMe(int[] ar){
        int write=2;

        for(int read=2;read<ar.length;read++){
            if(ar[read]!=ar[write-2]){
                ar[write]=ar[read];
                write++;
            }
        }
        System.out.println(write);
        return write;
    }

    public static void main(String[] args) {
        int[] ar = {1,1,1,2,2,3};
        new RemoveDupes2().solveMe(ar);
    }
}
