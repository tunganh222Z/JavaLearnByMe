package learningDSA.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class _1TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input size of nums array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("input nums array");
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("input target");
        int target = sc.nextInt();
        _1TwoSum test = new _1TwoSum();
        System.out.println(test.twoSum(nums, target).toString());
    }

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     * Example 1:
     *
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     *
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     *
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     */

    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;
        int[] res = new int[2];
        if (nums == null || nums.length == 0) return res;

        while (i < nums.length && j < nums.length) {
            if (nums[i] + nums[j] == target) {
                res[0] = i;
                res[1] = j;
                break;
            }
            j++;
            if (j == nums.length) {
                i++;
                j = i + 1;
            }
        }
        return res;
    }

    public int[] hashMapTwoPointer(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = target - nums[i];
            if (map.containsValue(tmp)) {
                return new int[] {i, map.get(tmp)};
            }
            map.put(i, tmp);
        }
        return new int[] {-1,-1};
    }
}
