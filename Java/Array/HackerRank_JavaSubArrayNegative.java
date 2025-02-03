package Array;

import java.util.Scanner;

public class HackerRank_JavaSubArrayNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        negativeSubArray(a);
    }

    private static void negativeSubArray(int[] a) {
        int k = 0;
        int count = 0;
        while (k < a.length){
            int sum = a[k];
            if (sum < 0) {
                count++;
            }
            for (int i = k+1 ; i < a.length; i++){
                sum = sum + a[i];
                if (sum < 0 ){
                    count++;
                }
            }
            k++;
        }
        System.out.println(count);
    }
}
