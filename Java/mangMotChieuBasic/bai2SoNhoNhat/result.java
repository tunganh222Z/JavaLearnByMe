package mangMotChieuBasic.bai2SoNhoNhat;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int min = minValue(a);

        countMinValue(a, min);
    }

    public static int minValue (int[] a){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++){

            if (a[i] <= min ){
                min = a[i];
            }
        }

        return min;
    }

    public static void countMinValue (int[] a, int minValue){
        int dem = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] == minValue){
                dem++;
            }
        }

        System.out.println(dem);
    }
}
