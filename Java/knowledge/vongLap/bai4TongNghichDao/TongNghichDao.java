package knowledge.vongLap.bai4TongNghichDao;

import java.util.Scanner;

public class TongNghichDao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double result = 0;

        for (int i = 1; i <= n; i++){
            result = result + (double) 1/i;
            System.out.println(result);
        }

        System.out.printf("%.3f%n", result);
    }
}
