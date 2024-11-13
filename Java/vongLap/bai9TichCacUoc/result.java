package vongLap.bai9TichCacUoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(tichCacUoc(lietKeCacUoc(n)));
    }

    public static List<Integer> lietKeCacUoc(int n){
        List<Integer> lietKeCacUoc = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                int j = n /i;

                if (i == j){
                    lietKeCacUoc.add(j);
                } else {
                    lietKeCacUoc.add(i);
                    lietKeCacUoc.add(j);
                }
            }
        }
        Collections.sort(lietKeCacUoc);
        return lietKeCacUoc;
    }

    public static int tichCacUoc(List<Integer> listCacUoc){
        int result = 1;
        for (int i =0; i < listCacUoc.size(); i++){
            result = result * listCacUoc.get(i);
        }
        return result;
    }
}
