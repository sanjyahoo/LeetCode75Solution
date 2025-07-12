package Patterns;

public class Pattern5 {
//7 7 7 7 7 7 7
//6 6 6 6 6 6
//5 5 5 5 5
//4 4 4 4
//3 3 3
//2 2
//1


    public static void main(String[] args) {
        int k=7;
        for(int i=0;i<8;i++){
            for(int j=7;j>i;j--){
                System.out.print(k+" ");
            }
            k--;
            System.out.println();
        }
    }
}
