package Patterns;

public class Pattern7 {
//7 6 5 4 3 2 1
//7 6 5 4 3 2
//7 6 5 4 3
//7 6 5 4
//7 6 5
//7 6
//7
    public static void main(String[] args) {
        for(int i=0;i<8;i++){
            for(int j=7;j>i;j--){
                System.out.print(j+" ");
            }
            System.out.println();

        }

    }
}
