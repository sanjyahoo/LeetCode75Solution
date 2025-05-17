package CodePackage;

public class ValidPallindroe {

    public boolean checkMe(String s){
        String cleaned = s.replaceAll("[^a-zA-Z0-9]","");
        int left = 0;
        int right = cleaned.length()-1;
        boolean isPallindrome = true;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                isPallindrome=false;
                break;
            }
            left++;
            right--;
        }

        return isPallindrome;
    }

    public static void main(String[] args) {
        System.out.println(new ValidPallindroe().checkMe("racecar"));
    }
}
