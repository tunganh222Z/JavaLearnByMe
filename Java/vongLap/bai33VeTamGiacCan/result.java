package vongLap.bai33VeTamGiacCan;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        imageNumber1(n);
    }

    public static void imageNumber1 (int n){
        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                //trigger khi j < n-1 trung diem
                if ( j < n-1){
                    if (j >= n-1-i){

                        System.out.print("*");

                    } else {

                        System.out.print(" ");
                    }
                    System.out.print(" ");

                //trigger khi j == n-1
                } else {
                    System.out.print("x");
                    System.out.print(" ");
                    int k = 0;
                    if (i != 0){
                        do {
                            System.out.print("*");

                            System.out.print(" ");

                            k++;
                        } while (k < i);
                    }
                }
            }
            System.out.println();
        }
    }
}

