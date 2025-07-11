package Patterns;

public class Pattern2 {
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
    public static void main(String[] args) {
        for(int i=0;i<=8;i++){
            for (int j=1; j < 8-i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
