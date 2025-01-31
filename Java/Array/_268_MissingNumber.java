package Array;

import java.util.Scanner;

public class _268_MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(missingNumber(nums));
    }

        public static int missingNumber(int[] nums) {

            int minIndex = Integer.MAX_VALUE;

            for (int i = 0; i < nums.length; i++){
                if (nums[i] < minIndex){
                    minIndex = nums[i];
                }
            }

            int missingNum = minIndex + 1;
            boolean status = true;
            int i = 0;

            while ( i < nums.length && missingNum < nums.length){
                status = false;
                if (nums[i] == missingNum){
                    missingNum++;
                    status = true;
                    i = 0;
                } else {
                    i++;
                }
            }

            if (status && minIndex > 0){
                return minIndex -1;
            } else {
                return missingNum;
            }
        }

    public int missingNumberRef (int[] a) {
        int n=a.length;
        int sum=(n*(n+1))/2;
        for(int i=0;i<n;i++){
            sum-=a[i];
        }
        return sum;
    }
}
