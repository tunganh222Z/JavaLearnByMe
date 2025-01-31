package sorting;

import java.util.Arrays;

public class _912_SortAnArray {
    public static void main(String[] args) {

        int[] a3 = {1,5,3,2,8,7,6,4};


        System.out.println(Arrays.toString(mergeSort(a3, 0, a3.length-1)));
    }

    public static int[] merge (int[] a1, int[] a2){
        int n = a1.length+ a2.length;
        int[] result = new int[n];

        int p = 0, p1 = 0, p2=0;
        while (p < n){
            if (p1 < a1.length && p2 < a2.length){
                if (a1[p1] < a2[p2]){
                    result[p] = a1[p1];
                    p++;
                    p1++;
                } else {
                    result[p] = a2[p2];
                    p++;
                    p2++;
                }
            } else {
                if (p1 < a1.length) {
                    // a1 != null
                    result[p] = a1[p1];
                    p++;
                    p1++;
                } else {
                    result[p] = a2[p2];
                    p++;
                    p2++;
                }
            }
        }
        return result;
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }

    public static int[] mergeSort (int[] a, int start, int end){
        //Bai toan co so
        if (start > end){
            return new int[0];
        } else if (start == end){
            int[] singleElement = {a[start]};
            return singleElement;
        }
        // Chia ra

        int mid = (start + end) / 2;
        int[] a1 = mergeSort(a, start, mid);
        int[] a2 = mergeSort(a, mid+1, end);

        //Tron vao
        int[]res = merge(a1,a2);
        return res;
    }

    /*
    Phân tích chi tiết và cây đệ quy
        Chia (Divide):

        Bước 1: Chia mảng thành hai nửa:

        a1 {1, 5, 3, 2}  |  a2 {8, 7, 6, 4}
        Bước 2: Chia tiếp từng nửa:

        a1.1 {1, 5}  |  a1.2 {3, 2}    ||    a2.1 {8, 7}  |  a2.2 {6, 4}
        Bước 3: Chia tiếp đến bài toán cơ sở (từng phần tử riêng lẻ):

        a1.1.1 {1} | a1.1.2 {5}  |  a1.2.1 {3} | a1.2.2 {2}    ||    a2.1.1{8} |  a2.1.2 {7}  |  a2.2.1 {6} | a2.2.2 {4}


        Gộp (Merge):

        Bước 1: Gộp các phần tử đơn lẻ thành mảng 2 phần tử đã sắp xếp:

        a1.1 = {1, 5}  |  a1.2 = {2, 3}    ||    a2.1 = {7, 8}  |  a2.2 = {4, 6}
        Bước 2: Gộp tiếp các nửa đã sắp xếp thành mảng 4 phần tử:

        a1 = {1, 2, 3, 5}    ||    a2 = {4, 6, 7, 8}
        Bước 3: Gộp toàn bộ mảng thành mảng hoàn chỉnh đã sắp xếp:

        {1, 2, 3, 4, 5, 6, 7, 8}
     */
}
