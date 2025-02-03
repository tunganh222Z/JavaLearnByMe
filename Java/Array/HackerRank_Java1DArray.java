package Array;

import java.io.IOException;
import java.util.Scanner;

public class HackerRank_Java1DArray {
    public static void main(String[] args) throws IOException {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] array = new int[n];

        for(int i =0; i< n;i++){
            array[i] = sc.nextInt();
        }

        for(int num : array){
            System.out.println(num);
        }
    }
}
