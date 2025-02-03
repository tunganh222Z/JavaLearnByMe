package Array;

import java.io.IOException;
import java.util.Scanner;

public class HackerRank_Java2DArray {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        int[][] array2D = new int[6][6];

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                array2D[i][j] = sc.nextInt();
            }
        }
        printLargestSumHourGlass(array2D);
    }

    public static void printLargestSumHourGlass(int[][] array2D){
        int largestSum = Integer.MIN_VALUE;
        int Row = 0;
        int Col = 0;

        for (int i = 0; i < array2D.length; i++){
            int sum = 0;
            if (i + 2 < array2D.length){
                for (int j = 0; j < array2D[0].length; j++){
                    if (j + 2 < array2D[0].length){
                        sum = array2D[i][j] + array2D[i][j+1] + array2D[i][j+2] + array2D[i+1][j+1] + array2D[i+2][j] + array2D[i+2][j+1] + array2D[i+2][j+2];
//                        System.out.println(array[i][j] + array[i][j+1] + array[i][j+2]);
//                        System.out.println(" " + array[i+1][j+1] + " ");
//                        System.out.println(array[i+2][j] + array[i+2][j+1] + array[i+2][j+2]);
                    }
                    if (sum > largestSum){
                        Row = i;
                        Col = j;
                        largestSum = sum;
                    }
                }
            }
        }
        System.out.println(largestSum);
    }
}
