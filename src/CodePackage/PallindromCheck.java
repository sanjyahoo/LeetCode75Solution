package CodePackage;

public class PallindromCheck {
    String s1="";
    public void palliCheck(String s){
        for(int i=s.length()-1; i>=0;i--){
            s1=s1+s.charAt(i);
        }

        if(s.equals(s1)){
            System.out.println("pallindrome");
        }else{
            System.out.println("not pallindrome");
        }
    }

    public static void main(String[] args) {

    }
}
