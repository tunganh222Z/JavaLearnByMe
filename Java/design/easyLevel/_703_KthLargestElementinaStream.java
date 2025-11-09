package design.easyLevel;

import java.util.Scanner;

public class _703_KthLargestElementinaStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

//        KthLargest test = new KthLargest(3, nums);
    }

    class KthLargest {
        int k = 0;
        int[] nums ;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            this.nums = nums;
        }

        public int add(int val) {
            int[] newNums = new int[this.nums.length+1];
            newNums = this.nums;
            newNums[newNums.length-1] = val;
            sortArray(newNums);
            return newNums.length-1-k;
        }

        public void sortArray(int[] nums){
            for (int i = 0; i < nums.length-1; i++) {
                int minIndex = i;

                for (int j = i+1; j < nums.length; j++) {
                    if (nums[minIndex] > nums[j]) {
                        minIndex = j;
                    }
                }

                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }
    }
}
