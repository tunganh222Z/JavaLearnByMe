package knowledge.mang2chieu.bai1;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int[][] a = new int[n+1][m+1];

        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= m; j++){
                a[i][j] = sc.nextInt();
            }
        }

        int minValue = a[1][1];

        int maxValue = a[1][1];

        for (int i = 1; i <= n; i++){
            for (int j = 1; j<=m; j++){
                minValue = Math.min(minValue, a[i][j]);
                maxValue = Math.max(maxValue, a[i][j]);
            }
        }
        System.out.println(minValue);

        for (int i = 1; i <= n ; i++){
            for (int j = 1; j <= m; j++){
                if (a[i][j] == minValue){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}