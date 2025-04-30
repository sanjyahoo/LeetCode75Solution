package CodePackage;

public class CanPlaceFlowers {

    //you have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
    //Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise
    //Example 1:
    //Input: flowerbed = [1,0,0,0,1], n = 1
    //Output: true
    //Example 2:
    //Input: flowerbed = [1,0,0,0,1], n = 2
    //Output: false
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        boolean canPlant=false;
        for(int i=0;i<flowerbed.length;i++){
            while(n>0)
            if(flowerbed[i]==0 && flowerbed[i+1]==0){
                n--;
            } else if(flowerbed[i]==1 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                n--;
            }
        }
        if(n==0){
            canPlant=true;
        }
        return canPlant;
    }

    public static void main(String[] args) {
        int flowerbed[] = {1,0,1,0,1,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
}
