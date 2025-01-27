package XauKyTu.bai1;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        String revertString = "";

        for (int i = n.length() -1; i >= 0 ; i--){
            revertString = revertString + n.charAt(i);
        }

        System.out.println(revertString);

        n = n.toLowerCase();

        System.out.println(n);

        n = n.toUpperCase();

        System.out.println(n);
    }
}
