package Array;

import java.util.Arrays;
import java.util.Scanner;

public class _977_SquaresOfASortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        _977_SquaresOfASortedArray test = new _977_SquaresOfASortedArray();

        System.out.println(Arrays.toString(test.squaresArrays(nums)));
    }


    public int[] squaresArrays(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        selectionSort(nums);

        return nums;
    }

    public int[] selectionSort(int[] nums){
        for (int i = 0; i < nums.length; i++){
            int minIndex = i;
            for (int j = i+1; j < nums.length; j++){
                if (nums[minIndex] > nums[j]){
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }
}
