package knowledge.vongLap.bai23VeHinh3;

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

    public static void imageNumber1 (int n){
        int number = 1;
        for (int  i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                System.out.print(number + " ");

                number++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imageNumber2 (int n){
        for (int i = 0; i < n; i++){

            int number = 1 + i;

            for (int j = 0; j < n; j++){

                System.out.print(number + " ");

                number++;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imageNumber3 (int n){
        for (int i = 0; i < n; i++){

            int number = 1 + i;

            for (int j = 0; j < n; j++){

                if (j >= n-1-i){

                    System.out.print(number);

                } else {

                    System.out.print("~");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void imageNumber4 (int n){

        for (int i = 1; i <= n; i++){
                int number = 0;

                int lastNumber = 0;

            for (int j = 0; j < i ; j++){

                if (j == 0){

                    System.out.print(i + " ");

                    lastNumber = i;
                } else {
                    number = lastNumber + n-j;

                    System.out.print(number + " ");

                    lastNumber = number;
                }
            }

            System.out.println();
        }
        System.out.println();
    }
}
