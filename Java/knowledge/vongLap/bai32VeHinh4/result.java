package knowledge.vongLap.bai32VeHinh4;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        imageNumber1(n);
    }

    public static void imageNumber1 (int n){


        for (int i = 0; i < n; i++){

            for (int j = 0; j <= i; j++){

                char letter = (char) ('A' + i);

                System.out.print(letter);
            }
            System.out.println();
        }
        System.out.println();
    }
}
