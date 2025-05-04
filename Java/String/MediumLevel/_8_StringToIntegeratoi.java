package String.MediumLevel;

import java.util.Scanner;
import java.util.regex.Pattern;

public class _8_StringToIntegeratoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        _8_StringToIntegeratoi test = new _8_StringToIntegeratoi();

        System.out.println(test.myAtoi(s));

    }



    public int myAtoi(String s) {
      int i = 0;
      if (s.isEmpty()) return 0;

      while (i < s.length() && s.charAt(i) == ' ') {
          i++;
      }

      if (i == s.length()) return 0;

      boolean isPositive = true;
      if (s.charAt(i) == '-' || s.charAt(i) == '+'){
          isPositive = s.charAt(i) != '-' ;
          i++;
      }

      long number = 0;
      while (i < s.length() && Character.isDigit(s.charAt(i))){
          int digit = s.charAt(i) - '0';
          number = number * 10 + digit;

          if (isPositive && number > Integer.MAX_VALUE) {
              return Integer.MAX_VALUE;
          }
          if (!isPositive && number < Integer.MIN_VALUE){
              return Integer.MIN_VALUE;
          }
          i++;
      }
      if (!isPositive){
          return (int)number * -1;
      }
      return (int) number;
    }

}
