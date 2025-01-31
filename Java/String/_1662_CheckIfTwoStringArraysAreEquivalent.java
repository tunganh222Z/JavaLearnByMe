package String;

import java.util.Scanner;

public class _1662_CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        String[] word1 = new String[2];
        String[] word2 = new String[3];

        for (int i = 0; i < word1.length; i++){
            word1[i] = sc.nextLine();
        }

        for (int i = 0; i < word2.length; i++){
            word2[i] = sc.nextLine();
        }

        System.out.println(arrayStringsAreEqual(word1, word2));

    }

        public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();

            for (String s1 : word1){
                sb1.append(s1);
            }

            for (String s2 : word2){
                sb2.append(s2);
            }

            if (sb1.toString().equals(sb2.toString())){
                return true;
            } else {
                return false;
            }
        }
}
