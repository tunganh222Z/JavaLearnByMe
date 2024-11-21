package mangMotChieuBasic.bai6CapSo1;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        capSo(a, k);


    }

    public static void capSo(int[] a, int k){
        int dem = 0;

        for (int i = 0; i < a.length; i++){

            for (int j = 0; j <= i-1; j++){

                int result = a[i] + a[j];

                if (result == k){
                    dem++;
                }
            }
        }
        System.out.println(dem);
    }
}
