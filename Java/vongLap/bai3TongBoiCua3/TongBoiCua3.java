package vongLap.bai3TongBoiCua3;

import java.util.Scanner;

public class TongBoiCua3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;

        for (int i = 0; i < n ; i++){
            if ( i % 3 == 0){
                result = result + i;
            }
        }
        System.out.println(result);
    }
}
