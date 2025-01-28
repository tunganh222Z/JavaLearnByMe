package knowledge.vongLap.bai7LietKeUoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LietKeUoc {

    public static List<Integer> lietKeUoc(int n){
        List<Integer> danhSachUoc = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++ ){
            if (n % i == 0){
                int j = n / i;

                if (j != i){

                    danhSachUoc.add(i);

                    danhSachUoc.add(j);

                } else {
                    danhSachUoc.add(i);
                }
            }

        }
        Collections.sort(danhSachUoc);

        return danhSachUoc;
    }

    public static int soLuongUoc(int n){
        return lietKeUoc(n).size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(lietKeUoc(n));
    }
}
