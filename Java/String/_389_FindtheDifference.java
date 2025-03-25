package String;

import java.util.Scanner;

public class _389_FindtheDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();

        _389_FindtheDifference test = new _389_FindtheDifference();

        int[] test123 = new int[126];
        System.out.println(test123[2]);

        System.out.println(test.findTheDifference(s, t));
    }

    /*
    Example 1:

        Input: s = "abcd", t = "abcde"
        Output: "e"
        Explanation: 'e' is the letter that was added.
        Example 2:

        Input: s = "", t = "y"
        Output: "y"
     */

    public char findTheDifference(String s, String t) {
        int[] seen = new int[128];
        char character = t.charAt(t.length()-1);

        if (s.isEmpty()){
            return character;
        }

        for (char c : s.toCharArray()){
            seen[c]++;
        }

        for (char c : t.toCharArray()){
            seen[c]--;
            if (seen[c] < 0) {
                return c;
            }
        }
        return ' ';
    }
}
