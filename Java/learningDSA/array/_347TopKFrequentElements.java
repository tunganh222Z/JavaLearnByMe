package learningDSA.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _347TopKFrequentElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int freq = sc.nextInt();
        _347TopKFrequentElements test = new _347TopKFrequentElements();
        System.out.println(test.topKFrequent(nums, freq));
    }

    /**
     * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
     * <p>
     * Example 1:
     * Input: nums = [1,1,1,2,2,3], k = 2
     * Output: [1,2]
     * <p>
     * Example 2:
     * Input: nums = [1], k = 1
     * Output: [1]
     * <p>
     * Example 3:
     * Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
     * Output: [1,2]
     */

    public int[] topKFrequent(int[] nums, int k) { //50ms too slow
        int[] arrayTopFreq = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        int maxFreq = Integer.MIN_VALUE;
        while (k > 0) {
            int key = Integer.MIN_VALUE;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (maxFreq < entry.getValue()){
                    maxFreq = entry.getValue();
                    key = entry.getKey();
                }
            }
            arrayTopFreq[arrayTopFreq.length - k] = key;
            maxFreq = Integer.MIN_VALUE;
            map.put(key, Integer.MIN_VALUE);
            k--;
        }
        return arrayTopFreq;
    }
}
