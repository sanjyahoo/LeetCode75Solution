package PracticePackage;

public class pivotIndex {

    public int solveMe(int[] ar){
        for(int i=0;i<ar.length;i++){
            if(getleftSum(ar,i)==getRightSum(ar,i)){
                System.out.println("pivot index is+ "+i);
                return i;
            }
        }
        return -1;
    }

    public int getleftSum(int[] ar, int index){
        int leftSum=0;
        if(index==0){
            return 0;
        }
        for(int currentIndex=0;currentIndex<=index-1;currentIndex++){
            leftSum=leftSum+ar[currentIndex];
        }
        return leftSum;
    }

    public int getRightSum(int[] ar, int index){
        int rightSum=0;
        if(index==ar.length-1){
            return 0;
        }
        for(int currentIndex=index+1;currentIndex<ar.length;currentIndex++){
            rightSum=rightSum+ar[currentIndex];
        }
        return rightSum;
    }

    public static void main(String[] args) {
        int[] ar = {1,7,3,6,5,6};
        new pivotIndex().solveMe(ar);
    }
}
