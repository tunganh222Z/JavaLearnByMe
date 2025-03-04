package Array;

import java.util.Scanner;

public class _747_LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        _747_LargestNumberAtLeastTwiceOfOthers test = new _747_LargestNumberAtLeastTwiceOfOthers();

        System.out.println(test.dominantIndex(nums));
    }
        /*
        Example 1:

            Input: nums = [3,6,1,0]
            Output: 1
            Explanation: 6 is the largest integer.
            For every other number in the array x, 6 is at least twice as big as x.
            The index of value 6 is 1, so we return 1.
        Example 2:

            Input: nums = [1,2,3,4]
            Output: -1
            Explanation: 4 is less than twice the value of 3, so we return -1.

         */
    public int dominantIndex(int[] nums) {

        int biggestElement = Integer.MIN_VALUE;
        int theSecond = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < nums.length; i ++){
            int element = nums[i];

            if (element > biggestElement){
                theSecond = biggestElement;
                biggestElement = element;
                index = i;
            }
            if (element > theSecond && element < biggestElement){
                theSecond = element;
            }

        }

        if (biggestElement >= (theSecond * 2)){
            return index;
        }
        return -1;
    }
}
