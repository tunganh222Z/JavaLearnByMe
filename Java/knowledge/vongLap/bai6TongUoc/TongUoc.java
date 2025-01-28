package knowledge.vongLap.bai6TongUoc;

import java.util.Scanner;

public class TongUoc {
    public static int tinhTongUoc(int n) {
        int result = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    result += i;
                } else {
                    int j = n / i;
                    result += i + j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(tinhTongUoc(n));
    }
}
