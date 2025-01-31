package binarySearch;

import java.util.Scanner;

public class _704_BinarySearch {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(search(nums, 9));
        System.out.println(searchDeQuy(nums, 9));
    }
    // -1 0 3 5 9 12
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid;

        while (start <= end){
            mid = (end + start) / 2;
            if (nums[mid] > target){
                end = mid - 1;
            } else if (nums[mid] < target){
                start = mid +1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int searchDeQuy(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;

        return searchDeQuy(nums, target,start, end);
    }

    public static int searchDeQuy(int[] nums,int target, int start, int end){
        if (start <= end){
            int mid = (start + end) /2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                return searchDeQuy(nums, target, start, mid-1);
            } else if (nums[mid] < target){
                return searchDeQuy(nums, target, mid+1, end);
            }
        }
            return -1;
    }
}
