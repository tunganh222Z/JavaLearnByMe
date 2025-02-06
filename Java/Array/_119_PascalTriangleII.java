package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _119_PascalTriangleII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(getRow(n));
    }

    static public List<Integer> getRow(int rowIndex) { //1ms
        List<Integer> prevArray = new ArrayList<>();
        List<Integer> curArray = new ArrayList<>();

        int value = 1;
        int left ;
        int right ;

        for (int i = 0; i <= rowIndex; i++){
            int k = 0;
            int j = 0;

            while (k <= i){
                if (k == 0 || k == i){
                    curArray.add(value);
                } else {
                    left = prevArray.get(j);
                    right = prevArray.get(j + 1);

                    curArray.add(left + right);
                    j++;
                }
                k++;
            }

            if (i == rowIndex){
                break;
            } else {
                prevArray = curArray;
                curArray = new ArrayList<>();
            }
        }
        return curArray;
    }

    public List<Integer> getRow1(int rowIndex) { //0ms
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long prev = 1;
        for (int k = 1; k <= rowIndex; k++) {
            long next_val = prev * (rowIndex - k + 1) / k;
            res.add((int) next_val);
            prev = next_val;
        }
        return res;
    }
}
