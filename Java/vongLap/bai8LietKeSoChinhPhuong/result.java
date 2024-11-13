package vongLap.bai8LietKeSoChinhPhuong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(soChinhPhuong(n));
    }

    public static List<Integer> soChinhPhuong(int n){
        List<Integer> listSoChinhPhuong = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n); i++){
            listSoChinhPhuong.add((int) Math.pow( i, 2));
        }

        Collections.sort(listSoChinhPhuong);
        return listSoChinhPhuong;
    }
}
