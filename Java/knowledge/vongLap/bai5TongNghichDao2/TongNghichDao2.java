package knowledge.vongLap.bai5TongNghichDao2;

import java.util.Scanner;

public class TongNghichDao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double result = 0;

        for (int i = 1; i <=n ; i++){
            result = result + (double) 1/(2*i);
        }

        System.out.printf("%.5f", result);
    }
}
