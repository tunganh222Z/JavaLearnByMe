package knowledge.mangMotChieuBasic.bai1DemChanLeTongChanLe;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int tongChan = 0;

        int tongLe = 0;

        int soLuongLe = 0;

        int soLuongChan= 0;

        for (int i = 0; i < n; i++){
            if (a[i] % 2 == 0){

                tongChan = tongChan + a[i];

                soLuongChan++;
            } else {
                tongLe = tongLe + a[i];

                soLuongLe++;
            }
        }
        System.out.println(soLuongChan);

        System.out.println(soLuongLe);

        System.out.println(tongChan);

        System.out.println(tongLe);
    }
}
