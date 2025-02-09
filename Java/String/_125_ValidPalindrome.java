package String;

import java.util.Scanner;

public class _125_ValidPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        _125_ValidPalindrome callFunction = new _125_ValidPalindrome();

        if (callFunction.isPalindrome(s)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public boolean isPalindrome(String s) {
        s = formatingString(s);
        boolean status = false;
        if (s.length() < 2) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right){
            if (s.charAt(left) == s.charAt(right)){
                status = true;
                left++;
                right--;
            } else {
                return false;
            }
        }

        return status;
    }

    private String formatingString(String s) {
        return s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
    }


}
