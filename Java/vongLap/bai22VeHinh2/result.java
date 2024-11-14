package vongLap.bai22VeHinh2;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        imageNumber1(n);

        imageNumber2(n);

        imageNumber3(n);

        imageNumber4(n);

        imageNumber5(n);
    }

    public static void imageNumber1 (int n){
        for (int i = 0; i < n; i++){

            for (int j = 0; j < i+1; j++){

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imageNumber2 (int n){
        for (int i = 0; i < n; i++){

            for (int j = n -1; j >= i; j--){

                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imageNumber3 (int n){
        for (int i = 0; i < n ;i++){

            for (int j = 0; j < n ; j++){

                if (j >= (n-1)-i){

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imageNumber4 (int n){
        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                if (j >= i){

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imageNumber5 (int n){
        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                if (i == n-1){

                    System.out.print("*");

                } else if (j == 0 || j == i){

                    System.out.print("*");

                } else {

                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
