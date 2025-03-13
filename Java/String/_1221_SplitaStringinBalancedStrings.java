package String;

import java.util.Scanner;

public class _1221_SplitaStringinBalancedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        _1221_SplitaStringinBalancedStrings test = new _1221_SplitaStringinBalancedStrings();

        System.out.println(test.balancedStringSplit(s));
    }
/*
        Example 1:
            Input: s = "RLRRLLRLRL"
            Output: 4
            Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
        Example 2:
            Input: s = "RLRRRLLRLL"
            Output: 2
            Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
            Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.
        Example 3:
            Input: s = "LLLLRRRR"
            Output: 1
            Explanation: s can be split into "LLLLRRRR".
 */
    public int balancedStringSplit(String s) { // 0ms beats 100%
        int countValidPattern = 0;
        char firstChar = s.charAt(0);
        int countR = 1;
        int countL = 0;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == firstChar){
                countR++;
            } else countL++;

            if (countR == countL){
                countValidPattern++;
                countR = 0;
                countL = 0;
            }
        }
        return countValidPattern;
    }
}
