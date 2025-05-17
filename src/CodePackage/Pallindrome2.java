package CodePackage;

public class Pallindrome2 {

    public boolean pallinCheck(String s){

        boolean isPallinDrome=true;

        for(int i=0;i< s.length()/2;i++){
            if(s.charAt(i)!= s.charAt(s.length()-1-i)){
                isPallinDrome=false;
                break;
            }
        }

        return isPallinDrome;
    }

    public static void main(String[] args) {
        Pallindrome2 ob = new Pallindrome2();
        System.out.println(ob.pallinCheck("A man, a plan, a canal: Panama"));
    }
}
