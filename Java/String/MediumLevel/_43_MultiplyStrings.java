package String.MediumLevel;

import java.util.Scanner;

public class _43_MultiplyStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        _43_MultiplyStrings test = new _43_MultiplyStrings();

        String num1 = sc.nextLine();

        String num2 = sc.nextLine();

        System.out.println(test.multiply(num1, num2));

//        System.out.println(test.multiply(num1, num2));
    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int[] res = new int[num1.length() + num2.length()];
        for (int i = num1.length()-1; i >=  0; i--){
            for (int j = num2.length()-1; j >= 0; j--){
                int multiDigit = (num1.charAt(i) -'0') * (num2.charAt(j) - '0');

                int sum = multiDigit + res[i+j-1];
                res[i+j+1] = sum % 10;
                res[i+j] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : res){
            if (sb.isEmpty() && num == 0 ) continue;
            sb.append(num);
        }
        return sb.toString();
    }

}
