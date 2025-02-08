package HashTable_SetMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _136_SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(singleNumber(nums));
    }

    static public int singleNumber(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (count.containsKey(nums[i])){
                count.put(nums[i], count.get(nums[i]) + 1);
            } else {
                count.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> map : count.entrySet()){
            if (map.getValue() == 1){
                return map.getKey();
            }
        }
        return 0;
    }
}
