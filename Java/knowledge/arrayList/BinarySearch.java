package knowledge.arrayList;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //BinarySearch điều kiện thì mảng phải được sắp xếp theo dạng tăng dần
        // left a[0] ; right a[n-1]; a[m] m = left + right / 2
        // a[m] = x => return true
        // a[m] > x => left = m +1
        // a[m] < x => right = m - 1
        int[] a = new int[5];
        // hoặc có thể dùng
        Arrays.binarySearch(a, 2);
    }

    public static boolean binarySearch ( int a[], int n, int x){
        int  l = 0, r = n-1;
        while (l <= n){
            int m = (l+r) / 2;
            if (a[m] == x){
                return true;
            } else if (a[m] < x){
                l = m+1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }
}
