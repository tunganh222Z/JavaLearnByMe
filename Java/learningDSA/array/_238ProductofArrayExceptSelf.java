package learningDSA.array;

import java.util.Scanner;

public class _238ProductofArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("input nums array");
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        _238ProductofArrayExceptSelf test = new _238ProductofArrayExceptSelf();
        System.out.println(test.productExceptSelf(nums));
    }

    /**
     * 238. Product of Array Except Self
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     *
     * Example 1:
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     *
     * Example 2:
     * Input: nums = [-1,1,0,-3,3]
     * Output: [0,0,9,0,0]
     */

    public int[] productExceptSelf(int[] nums) { // 3ms
        int[] prefix1 = new int[nums.length];
        int[] prefix2 = new int[nums.length];
        int[]res = new int[nums.length];
        for (int i = 0; i < prefix1.length -1; i++) {
            if (i == 0) {
                prefix1[i] = nums[i];
                continue;
            }
            prefix1[i] = prefix1[i-1] * nums[i];
        }

        for (int i = prefix2.length - 1; i >0; i--) {
            if (i == prefix2.length -1) {
                prefix2[i] = nums[i];
                continue;
            }
            prefix2[i] = prefix2[i+1] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 ) {
                res[i] = prefix2[i+1];
            } else if ( i == nums.length -1) {
                res[i] = prefix1[i-1];
            } else {
                res[i] = prefix1[i-1] * prefix2[i+1];
            }
        }
        return res;
    }
}
