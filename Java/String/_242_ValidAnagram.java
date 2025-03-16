package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _242_ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();
        _242_ValidAnagram test = new _242_ValidAnagram();
        String[] x = new String[1];

        System.out.println(test.isAnagram(s, t));
    }
/*
    Example 1:
        Input: s = "anagram", t = "nagaram"

        Output: true

    Example 2:
        Input: s = "rat", t = "car"

        Output: false
 */

    public boolean isAnagram(String s, String t) { //18ms isAnagram
        Map<Character, Integer> mapS = putToMap(s);
        Map<Character, Integer> mapT = putToMap(t);

        return mapS.equals(mapT);
    }

    public Map<Character, Integer> putToMap(String s){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            char character = s.charAt(i);
            if (!map.containsKey(character)){
                map.put(character, 1);
            } else {
                map.put(character, map.get(character) + 1);
            }
        }
        return map;
    }


    public boolean isAnagram4ms(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCounts = new int[26];

        for (char c : s.toCharArray()) {
            charCounts[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charCounts[c - 'a']--;
            if (charCounts[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
