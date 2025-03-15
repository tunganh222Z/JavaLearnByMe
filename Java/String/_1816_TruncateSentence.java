package String;

import java.util.Scanner;

public class _1816_TruncateSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        _1816_TruncateSentence test = new _1816_TruncateSentence();
        System.out.println(test.truncateSentence(s, 4));
    }
    /*
    Example 1:
            Input: s = "Hello how are you Contestant", k = 4
            Output: "Hello how are you"
        Explanation:
            The words in s are ["Hello", "how" "are", "you", "Contestant"].
            The first 4 words are ["Hello", "how", "are", "you"].
            Hence, you should return "Hello how are you".
        Example 2:

            Input: s = "What is the solution to this problem", k = 4
            Output: "What is the solution"
        Explanation:
            The words in s are ["What", "is" "the", "solution", "to", "this", "problem"].
            The first 4 words are ["What", "is", "the", "solution"].
            Hence, you should return "What is the solution".
        Example 3:

        Input: s = "chopper is not a tanuki", k = 5
        Output: "chopper is not a tanuki"
     */

    public String truncateSentence(String s, int k) { //2ms beats 50%
        String[] strings = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++){
            sb.append(strings[i] + " ");
        }
        return sb.toString().trim();
    }

    public String truncateSentence0ms(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
                if(count==k){
                    return s.substring(0,i);
                }
            }
        }
        return s;
    }
}
