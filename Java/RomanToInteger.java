import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        s = s.toUpperCase();
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int preValue = 0;

        for (int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);

            System.out.println(currentChar);

            int currentValue = roman.get(currentChar);

            if (currentValue > preValue){
                res = res - preValue + (currentValue - preValue);
            } else {
                res = res + currentValue;
            }
            preValue = currentValue;
        }
        return res;
    }
}
