package Array;

import java.util.Arrays;
import java.util.Scanner;

public class _283_MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        _283_MoveZeroes test = new _283_MoveZeroes();
        test.moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
     */
    public void moveZeroes(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;

        while (p1 < nums.length && p1 < p2) {
            int temp = 0;
            if (nums[p1] != 0) {
                p1++;
            } else {
                temp = nums[p1];
                for (int i = p1; i < p2; i++) {
                    nums[i] = nums[i + 1];
                }
                nums[p2] = temp;
                p2--;
            }
        }
    }

    public static void moveZeroes2(int[] nums) { // 1ms
        int i=0,j=0;
        while(i<nums.length){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
            i++;
        }
    }
}
