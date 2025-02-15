package Array;

import java.util.Scanner;

public class _485_MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        _485_MaxConsecutiveOnes findMax = new _485_MaxConsecutiveOnes();

        System.out.println(findMax.findMaxConsecutiveOnes(nums));
    }


    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int temp = 0;

        if (nums.length != 0 ){
            for (int  i = 0; i < nums.length; i++){
                if (nums[i] == 1){
                    temp = temp + 1;
                } else {
                    temp = 0;
                }
                count = Math.max(temp, count);
            }
        } else {
            return 0;
        }
        return count;
    }
}
