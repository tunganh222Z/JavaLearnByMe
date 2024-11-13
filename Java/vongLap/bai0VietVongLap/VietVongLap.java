package vongLap.bai0VietVongLap;

import java.util.Scanner;

public class VietVongLap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Dòng 1. In ra các số từ 1 tới n.
        for (int i = 0; i < n ; i++){
            int result = i+1 ;

            System.out.print(result +" ");
        }

        System.out.println();

        // Dòng 2 in ra các số từ n về 0.
        int  i = n;
        while ( i >= 0){
            int result = i;

            System.out.print(result + " ");

            i--;
        }
        System.out.println();

        // Dòng 3 in ra các số chẵn nhỏ hơn hoặc bằng n.
        int j = 0;
        while (j <= n){
            if (j % 2 == 0){
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();

        // Dòng 4 in ra các số lẻ nhỏ hơn hoặc bằng n.
        j = 0;
        while ( j <= n){
            if (j % 2 != 0){
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();

        // Dòng 5 in ra các bội số của 4 nhỏ hơn n.
        j=0;
        while (j <= n){
            if (j % 4 == 0){
                System.out.print(j + " ");
            }
            j++;
        }
        System.out.println();

        // Dòng 6 in ra N chữ cái in thường đầu tiên.
        j = 0;
        while (j < n){
            System.out.print((char) ('a' + j) + " ");
            j++;
        }
        System.out.println();

        // Dòng 7 in ra N chữ cái in thường cuối cùng theo thứ tự tăng dần.
        j = 26 - n;
        while (j < 26){
            System.out.print((char)('a'+j) + " ");
            j++;
        }
    }
}
