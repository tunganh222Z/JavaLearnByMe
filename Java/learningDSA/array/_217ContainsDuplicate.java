package learningDSA.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class _217ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input size of nums array");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("input nums array");
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        _217ContainsDuplicate test = new _217ContainsDuplicate();
        System.out.println(test.containsDuplicate2(nums));

    }

    /**
     * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     * Explanation:
     * The element 1 occurs at the indices 0 and 3.
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     * Explanation:
     * All elements are distinct.
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */

    public boolean containsDuplicate(int[] nums) { // 16ms
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i], 1);
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            if(set.size()<i+1) return true;
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        for (int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key){
                nums[j + 1] = nums[j];
                j--;
            }
            if (j >= 0 && nums[j] == key)
                return true;
            nums[j + 1] = key;
        }
        return false;

    }
}
