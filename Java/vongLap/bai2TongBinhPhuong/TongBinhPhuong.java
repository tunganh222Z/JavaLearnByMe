package vongLap.bai2TongBinhPhuong;

import java.util.Scanner;

public class TongBinhPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;

        for (int i = 1; i <=n ; i++){
            result = result + (int) Math.pow(i, 2);
        }

        System.out.println(result);
    }
}
