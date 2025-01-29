package knowledge.vongLap.bai21VeHinh;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        imageNumber1(n);

        imageNumber2(n);

        imageNumber3(n);

        imageNumber4(n);
    }

    public static void imageNumber1(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imageNumber2(int n){
        for (int i = 0; i < n; i++){
            if (i == 0 || i == n-1){
                for (int j = 0; j < n; j++){
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < n; j++){
                    if (j > 0 && j < n-1){
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imageNumber3(int n){
        for (int i = 0; i < n; i++){
            if (i == 0 || i == n-1){
                for (int j = 0; j < n; j++){
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < n; j++){
                    if (j > 0 && j < n-1){
                        System.out.print("#");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imageNumber4(int n){
        for (int i = 0; i < n; i++){
            if (i == 0 || i == n-1){
                for (int j = 0; j < n; j++){
                    System.out.print(i+1);
                }
            } else {
                for (int j = 0; j < n; j++){
                    if (j > 0 && j < n-1){
                        System.out.print(" ");
                    } else {
                        System.out.print(i+1);
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
