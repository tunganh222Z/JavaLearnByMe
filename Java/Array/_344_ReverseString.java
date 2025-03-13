package Array;

import java.util.Arrays;
import java.util.Scanner;

public class _344_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char[] s = new char[n];

        for (int i = 0; i < n; i++){
            s[i] = sc.next().charAt(0);
        }

        _344_ReverseString test = new _344_ReverseString();

        test.reverseString(s);

        System.out.println(Arrays.toString(s));
    }

/*
        Example 1:
            Input: s = ["h","e","l","l","o"]
            Output: ["o","l","l","e","h"]
        Example 2:
            Input: s = ["H","a","n","n","a","h"]
            Output: ["h","a","n","n","a","H"]
 */
    public void reverseString(char[] s) { // 0ms beats 100%
        if (s.length == 1){
            return;
        }

        int j = 0;
        for (int i = s.length-1; i >= s.length/2; i--){
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            j++;
        }
    }
}
