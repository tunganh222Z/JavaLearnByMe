package HackerRank.reverseAString;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        System.out.println(reverseAString(a));
    }

    private static String reverseAString(String a) {
        char[] aChars = a.toCharArray();

        char[] reverseChars = new char[a.length()];

        for ( int i = 0; i < a.length(); i++){
            reverseChars[i] = aChars[aChars.length-1-i];
        }

        return new String(reverseChars);
    }
}
