package PracticePackage;

public class ContainerWithMostWater {
    public int solveMe(int[] ar){
        int right=ar.length-1;
        int left=0;
        int maxWater=0;


        while(left<right){
            int currentWater = (right-left)* Math.min(ar[left],ar[right]);
            if(currentWater>maxWater){
                maxWater=currentWater;
            }
            if(ar[left]<ar[right]){
                left++;
            } else {
                right--;
            }
        }

        System.out.println(maxWater);
        return maxWater;
    }
    public static void main(String[] args) {
        int[] ar = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        new ContainerWithMostWater().solveMe(ar);
    }
}
