package CodePackage;

public class PallindromeSubString {

    public int checkMe(String s){
        int count = 0;

        String cleaned  = s.replaceAll("\\s","").toLowerCase();
        for(int i=0;i<cleaned.length();i++){
            count  = count + expandCenter(cleaned,i,i);
            count  = count + expandCenter(cleaned,i,i+1);
        }

        return count;

    }

    public int expandCenter(String cleaned, int left, int right){
        int count = 0;

        while(left>=0 && right<cleaned.length() && cleaned.charAt(left)==cleaned.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        PallindromeSubString ob = new PallindromeSubString();
        System.out.println(ob.checkMe("abc"));
    }
}
