package Array;

import java.util.Scanner;

public class _1295_FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int evenNumbers = findNumbers(nums);

        System.out.println(evenNumbers);
    }

    public static int findNumbers(int[] nums) {
        int evenDigts = 0;
        for (int i = 0; i < nums.length; i++){
            int temp = nums[i];
            int count = 0;
            while (temp != 0){
                temp = temp / 10;
                count++;
            }
            if (count % 2 == 0) {
                evenDigts++;
            }
        }
        return evenDigts;
    }

}
