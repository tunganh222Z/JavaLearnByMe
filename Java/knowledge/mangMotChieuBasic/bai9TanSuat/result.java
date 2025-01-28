package knowledge.mangMotChieuBasic.bai9TanSuat;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        demTanSuat(a);

        String test = "tunganhprovip";

        char[] charArray = test.toCharArray();

        for (int i = 0; i < charArray.length ; i++){
            boolean status = false;
            for (int j = charArray.length-1 ; j > i ; j--){
                if (charArray[i] == charArray[j]){
                    status = true;
                } else
                    status = false;
            }

            if (status == false){
                System.out.println(charArray[i]);
            }
        }


    }

    public static void demTanSuat(int[] a){

        for (int i = 0; i < a.length; i++){

            int dem =1;

            boolean seen = false;

            for (int j = 0; j < i; j++){

                if (a[i] == a[j]){

                    seen = true;
                }
            }
            if (!seen){

                for (int k = i+1; k < a.length; k++){

                    if (a[i] == a[k]){

                        dem++;
                    }
                }
                System.out.println(a[i] + " " + dem);
            }
        }
    }
}
