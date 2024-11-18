package mangMotChieuBasic.bai4LonHonNhoHon;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        compareWithX(a, x);
    }

    public static void compareWithX(int[] a, int x){
        int greaterThanX = 0;

        int lessThanX = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < x){
                lessThanX++;
            } else {
                greaterThanX++;
            }
        }
        System.out.println(lessThanX);

        System.out.println(greaterThanX);
    }

}
