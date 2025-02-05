package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _118_PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(generate(n));
    }

    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        int value = 1;
        int left ;
        int right ;

        for (int i = 0; i < numRows; i++){
            List<Integer> subArray = new ArrayList<>();
            int k = 0;
            int j = 0;

                while (k <= i){
                    if (k == 0 || k == i){
                        subArray.add(value);
                    } else {
                        left = pascalTriangle.get(i-1).get(j);
                        right = pascalTriangle.get(i-1).get(j + 1);

                        subArray.add(left + right);

                        j++;
                    }
                    k++;
                }

            pascalTriangle.add(i, subArray);
        }

        return pascalTriangle;
    }
}
