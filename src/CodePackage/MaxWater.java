package CodePackage;

public class MaxWater {

    public void maxArea(int[] height){
        int left = 0;
        int right = height.length-1;
        int maxValue=0;

        while(left<right){
            int min_value = Math.min(height[left],height[right]);
            int x = right-left;
            int current_max = min_value*x;
            if(current_max>maxValue){
                maxValue=current_max;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(maxValue);
    }

    public static void main(String[] args) {
        int ar[] = {1,8,6,2,5,4,8,3,7};
        new MaxWater().maxArea(ar);
    }
}
