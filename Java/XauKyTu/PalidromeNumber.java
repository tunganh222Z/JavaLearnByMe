package XauKyTu;

import java.util.Scanner;

public class PalidromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (isPalidromeNumber(num)){
            System.out.println("true");
        }

    }

    private static boolean isPalidromeNumber(int num) {
        String convertNum = String.valueOf(num);
        char[] chars = convertNum.toCharArray();
        boolean status = false;
        int right = 0;
        int left = chars.length -1;

        if (chars.length == 1){
            return true;
        }

        while ( right < left){

            if (chars[right] == chars[left]){
                status = true;
            } else {
                status = false;
                break;
            }
            right++;
            left--;
        }
        return status;
    }
}
