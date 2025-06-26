package PracticePackage;

public class ReverseString {
    public void solveMe(char[] s){
        char temp;
        int left=0;
        int right=s.length-1;

        while(left<right){
            temp = s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        new ReverseString().solveMe(s);
    }
}
