package Array;

import java.util.Scanner;

public class _1346_CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        _1346_CheckIfNAndItsDoubleExist test = new _1346_CheckIfNAndItsDoubleExist();

        System.out.println(test.checkIfExist(arr));
    }

    public boolean checkIfExist(int[] arr) {
        boolean exist = false;
        if (arr.length < 1){
            return false;
        } else {
            for (int i = 0; i < arr.length; i++){
                if (arr[i] % 2 !=0){
                    continue;
                } else {
                    int j = 0;

                    while (j < arr.length){

                        if (arr[i] == arr[j] *2 ){
                            return true;
                        }
                        j++;
                    }
                }
            }
        }
        return exist;
    }
}
