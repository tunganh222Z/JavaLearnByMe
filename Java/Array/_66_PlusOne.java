package Array;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class _66_PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(plusOne(digits)));
    }


    public static int[] plusOne(int[] digits) {
        int index = digits.length-1;
        int plusNum = 1;
        while (index >= 0 && plusNum > 0){
            if (digits[index] == 9){
                digits[index] = 0;
                index--;
            } else {
                digits[index] = digits[index] + plusNum;
                plusNum--;
            }
        }

        if (plusNum > 0){
            int[] newDigits = new int[digits.length+1];
            for (int i = 1; i < newDigits.length; i++){
                newDigits[i] = 0;
            }
            newDigits[0] = plusNum;
            return newDigits;
        } else {
            return digits;
        }
    }
}
