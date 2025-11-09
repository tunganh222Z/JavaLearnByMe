package design.easyLevel;

import java.util.Scanner;

public class _303_RangeSumQueryImmutable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        NumArray test = new NumArray(nums);

        System.out.println(test.sumRange(0, 2));
    }
}


class NumArray {
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++){
            sum += nums[i];
        }
        return sum;
    }
}
