package Patterns;

public class Pattern4 {
//1
//2 2
//3 3 3
//4 4 4 4
//5 5 5 5 5
//6 6 6 6 6 6
//7 7 7 7 7 7 7
    public static void main(String[] args) {
        int j=1;
        for(int k=1;k<8;k++){
            for(int i=0;i<k;i++){
                System.out.print(j+" ");
            }
            j++;
            System.out.println();
        }

    }
}
