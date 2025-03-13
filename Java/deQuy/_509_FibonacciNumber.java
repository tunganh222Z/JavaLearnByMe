package deQuy;

import java.util.Scanner;

public class _509_FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        _509_FibonacciNumber test = new _509_FibonacciNumber();
        System.out.println(test.fib(n));
    }

    static int[] f = new int[1000];
    public int fib(int n) { // 0ms beats 100%
        if (f[n] != 0){
            return f[n];
        } else if (n == 0){
            return 0;
        }

        if (n <= 2){
            f[1] = 1;
            f[2] = 1;
            return 1;
        }

        f[n] = fib(n-1) + fib(n-2);
        return f[n];
    }
}
