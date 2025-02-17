package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _448_FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        _448_FindAllNumbersDisappearedInAnArray test = new _448_FindAllNumbersDisappearedInAnArray();
        System.out.println(test.findDisappearedNumbers(nums));
    }
    /*
    Example 1:

    Input: nums = [4,3,2,7,8,2,3,1] -> 1 2 2 3 3 4 7 8
    Output: [5,6]
    Example 2:

    Input: nums = [1,1]
    Output: [2]
     */

    public List<Integer> findDisappearedNumbers(int[] nums) { //time limit exceed
        insertionSort(nums);
        List<Integer> disappearedNumbers = new ArrayList<>();

        int p1 =0;
        int disappearedNum = nums[p1];

        while (p1 < nums.length && disappearedNum <= nums.length){
            boolean seen = false;
            for (int i = p1; i < nums.length; i++){
                if (nums[i] == disappearedNum){
                    seen = false;
                    break;
                } else {
                    seen = true;
                }
            }
            if (seen){
                disappearedNumbers.add(disappearedNum);

            }
            p1++;
            disappearedNum++;
        }

        return disappearedNumbers;
    }

    public void insertionSort (int[] nums){
        for (int i =0; i < nums.length; i++){
            int ai = nums[i];
            int j = i-1;
            while (j >= 0&& nums[j] > ai){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = ai;
        }
    }
}
