package knowledge.HackerRank.anagram;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String b = sc.nextLine();

        if (isAnnaGram(a, b) == true){
            System.out.println("AnnaGram");
        } else {
            System.out.println("Not AnnaGram");
        }
    }

    public static boolean isAnnaGram(String a, String b){
        boolean status = false;

        a = a.toLowerCase();

        b = b.toLowerCase();

        if ( a.length() == b.length()){
            char[] aChars = a.toCharArray();

            char[] bChars = b.toCharArray();

            Arrays.sort(aChars);

            Arrays.sort(bChars);

            if (Arrays.equals(aChars, bChars)){
                status = true;
            }
        }

        return status;
    }
}
