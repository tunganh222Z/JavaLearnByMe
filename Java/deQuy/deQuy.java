package deQuy;

import java.util.Scanner;

public class deQuy {
    public static void main(String[] args) {
        System.out.println(giaiThua(3));

        //De quy
        System.out.println(soFibo(10));

        //De quy co nho
        System.out.println(soFibo2(10));

        //Khong dung de quy
        System.out.println(soFibo3(10));
    }

    public static void printElement (int[] array, int index){
        if (index < 0 || index >= array.length){
            return;
        }



        printElement(array, index +1);

        System.out.println(array[index]);
    }

    public static int giaiThua (int n){
        if (n == 0 ){
            return 1;
        }

        return n * giaiThua(n-1);
    }

    public static int soFibo (int n){
        if ( n < 0 && n <= 2){
            return 1;
        } else if (n == 0) {
            return 0;
        }

        return soFibo(n-1) + soFibo(n-2);
        /*
        n = 3
        sofibo2 + sofibo 1 (1)
        sofibo 2 = sofibo2-1 + sofibo 2-2 + 1
        sofibo 2 = sofibo1 + sofibo 0 + 1 => 2
         */

    }

    static int[] f = new int[1000];
    public static int soFibo2 (int n){
        if (f[n] != 0){
            return f[n];
        }
        if (n <= 2){
            f[1] = 1;
            f[2] = 1;
            return 1;
        }

        f[n] = soFibo2(n-1) + soFibo2(n - 2);
        return f[n];
    }

    public static int soFibo3 (int n){
        int[] f = new int[n+1];
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
