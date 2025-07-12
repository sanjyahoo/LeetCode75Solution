package Patterns;

public class Pattern6 {
//7
//7 6
//7 6 5
//7 6 5 4
//7 6 5 4 3
//7 6 5 4 3 2
//7 6 5 4 3 2 1
    public static void main(String[] args) {
        for(int i=7;i>0;i--){
            for(int j=7;j>=i;j--){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
