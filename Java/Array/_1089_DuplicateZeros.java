package Array;

import java.util.Arrays;
import java.util.Scanner;

public class _1089_DuplicateZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        _1089_DuplicateZeros test = new _1089_DuplicateZeros();
        test.duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void duplicateZeros(int[] arr) { //12ms
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] == 0 ){
                int p1 = arr.length-2;
                int p2 = arr.length-1;
                while (p1 > i){
                    arr[p2] = arr[p1];
                    p1--;
                    p2--;
                }
                arr[p2] = 0;
                i++;
            }
        }
    }
}
