package Array;

import java.util.Scanner;

public class _3392_CountSubarraysofLengthThreeWithaCondition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        _3392_CountSubarraysofLengthThreeWithaCondition test = new _3392_CountSubarraysofLengthThreeWithaCondition();

        System.out.println(test.countSubarrays(nums));

    }
        public int countSubarrays(int[] nums) {
        int count = 0;
            for (int  i = 0; i < nums.length-2; i ++){
                if (((nums[i] + nums[i+2]) *2) == nums[i+1]) {
                    count++;
                }
            }
            return count;
        }
}
