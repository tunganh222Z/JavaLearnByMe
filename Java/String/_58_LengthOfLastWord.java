package String;

import java.util.Scanner;
import java.util.Stack;

public class _58_LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        Stack stack = new Stack<>();
        int length = 0;
        char character = ' ';
        for (int i = s.length()-1; i >= 0; i--){
            if (s.charAt(i) != character){
                length++;
            }
            if (s.charAt(i) == character && length >0){
                break;
            }
        }
        return length;
    }
}
