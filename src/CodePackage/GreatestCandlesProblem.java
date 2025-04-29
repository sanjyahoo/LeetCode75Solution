package CodePackage;

//There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
//Note that multiple kids can have the greatest number of candies.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCandlesProblem {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List booleanResult = new ArrayList();
        int[] originalCopy = Arrays.copyOf(candies, candies.length);
        Arrays.sort(candies);
        int highestNum = candies[candies.length-1];
        for(int i=0;i<originalCopy.length;i++){
            if(originalCopy[i]+extraCandies<highestNum){
                booleanResult.add(false);
            } else {
                booleanResult.add(true);
            }
        }
        System.out.println(booleanResult);
        return booleanResult;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        kidsWithCandies(candies,extraCandies);
    }
}
