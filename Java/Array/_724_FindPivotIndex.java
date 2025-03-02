package Array;

import java.util.Scanner;

public class _724_FindPivotIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        _724_FindPivotIndex test = new _724_FindPivotIndex();

        System.out.println(test.pivotIndex(nums));
    }

    /*
    Example 1:
        Input: nums = [1,7,3,6,5,6]
        Output: 3
        Explanation:
        The pivot index is 3.
        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
        Right sum = nums[4] + nums[5] = 5 + 6 = 11

    Example 2:
        Input: nums = [1,2,3]
        Output: -1
        Explanation:
        There is no index that satisfies the conditions in the problem statement.

    Example 3:
        Input: nums = [2,1,-1]
        Output: 0
        Explanation:
        The pivot index is 0.
        Left sum = 0 (no elements to the left of index 0)
        Right sum = nums[1] + nums[2] = 1 + -1 = 0
     */

    /*

     */
    public int pivotIndex(int[] nums) { // 371 ms too slow
        int pivotIndex = 0;
        int sumLeft ;
        int sumRight ;
        while (pivotIndex < nums.length){
            sumLeft = 0;
            sumRight = 0;
            for (int i = 0; i < pivotIndex; i++){
                sumLeft += nums[i];
            }

            for (int j = nums.length-1; j > pivotIndex; j--){
                sumRight += nums[j];
            }

            if (sumLeft == sumRight){
                return pivotIndex;
            }
            pivotIndex++;
        }

        return -1;
    }



    public int pivotIndex2(int[] nums) { // the best speed

        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        int tmpSum = 0;
        for (int k = 0; k < n; k++) {
            sum -= nums[k];
            if (tmpSum == sum)
                return k;
            else
                tmpSum += nums[k];
        }

        return -1;
    }
}
