package String.MediumLevel;

import java.util.Scanner;

public class _12_IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        _12_IntegerToRoman test = new _12_IntegerToRoman();
        System.out.println(989 % 100);
        System.out.println(test.intToRoman(num));
    }

    public String intToRoman(int num) { //5ms beats 34%
        //1 3 5 7 9 11 -> index lẻ
        int[] values = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] symbols = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        String symbol = "";
        int constantNumber = 10;

        while (num > 0) {
            String tempSymbol = "";
            int number;

            if (constantNumber <= 1000) {
                number = num % constantNumber;
            } else {
                number = num / (num / values[values.length-1]);
            }

            num = num - number;
            int i = 1;
            int j = 0;
            while (number > 0){
                if (values[j] == number){
                    tempSymbol += symbols[j];
                    break;
                }
                if (values[i] > number && values[j] < number){
                    tempSymbol += symbols[j];
                    number = number - values[j];
                    continue;
                } else if (values[j] > number) {
                    j--;
                    continue;
                }
                j++;
                i++;
            }
            symbol = tempSymbol + symbol;
            constantNumber = constantNumber * 10;
        }

        return symbol;
    }

    public String intToRoman100Percent(int num) {

        int[] vals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] syms = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < vals.length; i++){
            int count = num / vals[i];  // How many times the char repeats
            num %= vals[i];             // The remainder
            while (count-- > 0){
                sb.append(syms[i]);
            }

            if (num == 0) break;

        }


        return sb.toString();
    }
}
