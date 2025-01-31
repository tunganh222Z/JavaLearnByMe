package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = {6,7,8,5,4,3,2,1};

        quickSort(a, 0, a.length-1);

        System.out.println(Arrays.toString(a));
    }


    public static void quickSort(int[] nums, int start, int end){
        //B0 Bai toan co so - Dieu kien dung
        if (start >= end){
            return;
        }
        //B1 chon a[mid]
        int key = nums[(end + start) /2];
        //B2 Phan bo lai mang theo mid
        int k = partition(nums, start, end, key);

        System.out.println("start = " + start + " -" + " left = " + end + " - key = " + key);
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, start, end+1)));
        //B3 Chia doi mang
        quickSort(nums, start, k-1);
        quickSort(nums, k, end);
    }


    //return pivot value
    public static int partition (int[] a, int start, int  end, int key){
        int left = start;
        int right = end;
        while (left <= right){
            while (a[left] < key) {
                left++;
            }
            while (a[right] > key){
                right--;
            }
            if (left <= right){
                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }
}
