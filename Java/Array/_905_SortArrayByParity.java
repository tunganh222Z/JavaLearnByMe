package Array;

import java.util.Arrays;
import java.util.Scanner;

public class _905_SortArrayByParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        _905_SortArrayByParity test = new _905_SortArrayByParity();
        System.out.println(Arrays.toString(test.sortArrayByParity(nums)));
    }

    /*
    Input: nums = [3,1,2,4]
    Output: [2,4,3,1]
    Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
    move all the even integers at the beginning of the array followed by all the odd integers.
     */

    public int[] sortArrayByParity(int[] nums) { // 0ms beat 100%
        int p1 =0;
        int p2 = nums.length-1;
        if (nums.length < 1){
            return nums;
        }
        while (p1 <= p2){
            if (nums[p1] % 2 !=0 ){
                if (nums[p2]% 2 ==0){
                    int temp = nums[p2];
                    nums[p2] = nums[p1];
                    nums[p1] = temp;
                    p1++;
                }
                p2--;
            } else {
                p1++;
            }
        }
        return nums;
    }
}
