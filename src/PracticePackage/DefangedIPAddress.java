package PracticePackage;

public class DefangedIPAddress {
    public void solveMe(String s){
        System.out.println(s.replaceAll("\\.","[.]"));

    }
    public static void main(String[] args) {
        new DefangedIPAddress().solveMe("1.1.1.1");
    }
}
