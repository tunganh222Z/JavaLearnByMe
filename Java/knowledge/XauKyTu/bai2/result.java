package knowledge.XauKyTu.bai2;

import java.util.Scanner;

public class result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        String dob = sc.nextLine();

        System.out.println(convertName(name));

        System.out.println(convertDOB(dob));
    }

    public static String convertName(String s){
        String res = "";
        String[] arr = s.split("\\s+");

        for (String x : arr){
            res  = res + Character.toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++){
                res = res + Character.toLowerCase(x.charAt(i));
            }
            res = res + " ";
        }
        return res.trim();
    }

    public static String convertDOB(String s){
        String res = "";

        String[] arr = s.split("/");

        for (String x : arr){
            String tmp = String.format("%02d", Integer.parseInt(x));
            res = res + tmp + "/";
        }

        return res.replaceAll("/$", "");
    }
}



