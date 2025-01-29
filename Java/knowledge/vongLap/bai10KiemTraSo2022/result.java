package knowledge.vongLap.bai10KiemTraSo2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        List<Integer> listNum = new ArrayList<>();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();

            listNum.add(n);
        }

        is2022Displayed(listNum);

    }

    public static void is2022Displayed(List<Integer> listNum) {
        boolean status = false;
        for (Integer num : listNum) {

            if (num == 2022) {

                status = true;

            }
        }

        if (status == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
