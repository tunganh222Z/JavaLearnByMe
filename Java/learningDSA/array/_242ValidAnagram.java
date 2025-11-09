package learningDSA.array;

import java.util.Scanner;

public class _242ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        _242ValidAnagram test = new _242ValidAnagram();
        System.out.println(test.isAnagram(s, t));
    }

    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() > t.length()) return false;
        int[] arrayS = new int[48];
        for (int i = 0; i < s.length(); i++) {
            arrayS[s.charAt(i) - 'a'] = ++arrayS[s.charAt(i) - 'a'];
        }

        for (int i = 0; i < t.length(); i++){
            arrayS[t.charAt(i) - 'a'] = --arrayS[t.charAt(i) - 'a'];
            if (arrayS[t.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }
}
