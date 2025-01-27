package oop.bai24;

import oop.bai2.InvalidExceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        List<SinhVien> sinhVienList = new ArrayList<>();

        for (int i = 0; i < n; i++){

        }

        for (SinhVien sinhVien : sinhVienList){
            try {
                sinhVien.getSvInfo();
            } catch (InvalidExceptions ie) {
                System.err.println(ie.getMessage());
            }
        }
    }


}
