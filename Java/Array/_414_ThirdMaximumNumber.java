package Array;

import java.util.Scanner;

public class _414_ThirdMaximumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[]  nums = new int[n];

        for (int i = 0; i < n ; i++){
            nums[i] = sc.nextInt();
        }

        _414_ThirdMaximumNumber test = new _414_ThirdMaximumNumber();

        test.thirdMax(nums);
    }
    /*
    Input: nums = [3,2,1]
    Output: 1
    Explanation:
    The first distinct maximum is 3.
    The second distinct maximum is 2.
    The third distinct maximum is 1.

    Input: nums = [1,2]
    Output: 2
    Explanation:
    The first distinct maximum is 2.
    The second distinct maximum is 1.
    The third distinct maximum does not exist, so the maximum (2) is returned instead.
     */
    public int thirdMax(int[] nums) {
        bubbleSort(nums);
        boolean found = false;
        if (nums.length < 3){
            return nums[nums.length-1];
        }
        boolean secondNumber = false;
        for (int i = nums.length-2; i >=0; i--){
            if (nums[i] < nums[nums.length-1] && !secondNumber){
                secondNumber = true;
                continue;
            }

            if (nums[i] < nums[i+1] && secondNumber){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
    }

    public int thirdMax1ms(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int i=0; i< nums.length; i++) {
            int element = nums[i];

            if (element == first || element == second || element == third) {
                continue;
            }

            if(element > first) {
                third = second;
                second = first;
                first = element;
            }else if( element > second ) {
                third = second;
                second = element;
            }else if( element > third) {
                third = element;
            }
        }
        if(third == Long.MIN_VALUE) {
            return (int)first;
        } else {
            return (int)third;
        }
}
