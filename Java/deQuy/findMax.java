package deQuy;

import java.util.Scanner;

public class findMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        findMax1(array, 0);

        System.out.println(curMax);

        System.out.println(findMax2(array, 0, -1));
    }

    //Khong tra ve ket qua
    static int curMax = -1;
    public static void findMax1 (int[] array, int i){
        if (i < array.length){
            if (array[i] > curMax){
                curMax = array[i];
            }
            findMax1(array, i+1);
        }
    }

    public static int findMax2 (int[] array, int i, int prevMax){
        if (i < array.length){
            int curMax = Math.max(prevMax, array[i]);
            return findMax2(array, i+1, curMax);
        }
        return prevMax;
    }
}
