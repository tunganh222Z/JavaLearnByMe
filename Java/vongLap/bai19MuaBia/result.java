package vongLap.bai19MuaBia;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(tongSoChaiBia(n));
    }

    public static int soChaiBiaCoTheMua(int n){
        int beerPrice = 28;
        int soChaiBia = n / beerPrice;
        return soChaiBia;
    }

    public static int soChaiBiaCoTheDoi(int soChaiBia){
        int doiBia = 0;

        while (soChaiBia >= 3){
            int doiVoLayBia = soChaiBia /3;

            doiBia = doiBia +  doiVoLayBia;

            soChaiBia = soChaiBia - (doiVoLayBia * 3) + doiVoLayBia;
        }
        return doiBia;
    }

    public static int tongSoChaiBia(int n){
        return soChaiBiaCoTheDoi(soChaiBiaCoTheMua(n)) + soChaiBiaCoTheMua(n);
    }
}
