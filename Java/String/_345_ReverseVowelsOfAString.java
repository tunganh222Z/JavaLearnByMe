package String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class _345_ReverseVowelsOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        _345_ReverseVowelsOfAString test = new _345_ReverseVowelsOfAString();

        System.out.println(test.reverseVowels(s));
    }

    /*
    Example 1:
        Input: s = "IceCreAm"
        Output: "AceCreIm"
        Explanation:
        The vowels in s are ['I', 'e', 'e', 'A'] -> [A e e I]. On reversing the vowels, s becomes "AceCreIm".
    Example 2:
        Input: s = "leetcode"
        [e e o e] -> [e o e e]
        Output: "leotcede"
     */
    public String reverseVowelstimeLimitExceeded(String s) { // timeLimitExceeded
        char[] sVowels = new char[s.length()];
        char[] x = s.toCharArray();
        int index = 0;
        for (char c : s.toCharArray()){
            if (checkVowels(c)){
                sVowels[index] = c;
                index++;
            }
        }
        int k = sVowels.length-1;
        for (int i = 0; i < x.length; i++){
            if (contains(x[i], sVowels)){
                x[i] = sVowels[index-1];
                index--;
            }
        }
        return new String(x);
    }
    public String reverseVowels(String s){ //4ms with two pointers
        char[] chars = s.toCharArray();
        int j = 0;
        int k = chars.length-1;
        while (j < k){
            if (checkVowels(chars[j])){
                if (checkVowels(chars[k])){
                    char temp = chars[j];
                    chars[j] = chars[k];
                    chars[k] = temp;
                    j++;
                    k--;
                } else {
                    k--;
                }
            } else {
                j++;
            }
        }
        return new String(chars);
    }

    public boolean contains(char c, char[] vowels){
        for (char x : vowels){
            if (c == x){
                return true;
            }
        }
        return false;
    }

    public boolean checkVowels(char c){
        char[] vowels = {'u','e','o','a','i','U','E','O','A','I'};
        return contains(c, vowels);
    }
}
