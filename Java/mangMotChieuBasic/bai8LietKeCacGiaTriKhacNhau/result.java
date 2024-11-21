package mangMotChieuBasic.bai8LietKeCacGiaTriKhacNhau;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){
            boolean status = true;
            for (int j = 0; j <= i-1; j++) {
                if (i != j){
                    if (a[i] == a[j]) {
                        status = false;
                        break;
                    } else {
                        status = true;
                    }
                }

            }
            if (status == true){
                System.out.print(a[i] + " ");
            }
        }

    }
}
