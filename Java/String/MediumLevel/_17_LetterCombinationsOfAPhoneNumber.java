package String.MediumLevel;

import java.util.*;

public class _17_LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digts = sc.nextLine();

        _17_LetterCombinationsOfAPhoneNumber test = new _17_LetterCombinationsOfAPhoneNumber();

        System.out.println(test.letterCombinations(digts));
    }

    public List<String> letterCombinations(String digits) {
        Map<Character, String[]> listNumerString = listNumberString();
        char[] chars = digits.toCharArray();
        if (digits.isEmpty()) return null;

        return null;
    }

    public Map<Character, String[]> listNumberString(){
        String[] number1 = {};
        String[] number2 = {"a","b","c"};
        String[] number3 = {"d","e","f"};
        String[] number4 = {"g","h","i"};
        String[] number5 = {"j","k","l"};
        String[] number6 = {"m","n","o"};
        String[] number7 = {"p","q","r","s"};
        String[] number8 = {"t","u","v"};
        String[] number9 = {"w","x","y","z"};
        List<String[]> listNumber = new ArrayList<>();
        Map<Character, String[]> map = new HashMap<>();
        map.put('2', number2);
        map.put('3', number3);
        map.put('4', number4);
        map.put('5', number5);
        map.put('6', number6);
        map.put('7', number7);
        map.put('8', number8);
        map.put('9', number9);
        map.put('1', number1);
        return map;
    }
}
