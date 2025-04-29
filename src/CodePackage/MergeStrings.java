package CodePackage;

public class MergeStrings {
    public static String mergeAlternately(String word1, String word2) {
        char[] ar1 = word1.toCharArray();
        char[] ar2 = word2.toCharArray();
        char[] finalChar = new char[ar1.length+ar2.length];

        int i = 0, j = 0, k = 0;

        while (i < ar1.length || j < ar2.length) {
            if (i < ar1.length) {
                finalChar[k++] = ar1[i++];
            }
            if (j < ar2.length) {
                finalChar[k++] = ar2[j++];
            }
        }
        return  String.valueOf(finalChar);
    }

    public static void main(String[] args) {
        mergeAlternately("uiyyiu","rtart");
    }
}
