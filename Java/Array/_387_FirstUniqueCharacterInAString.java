package Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _387_FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(firstUniqChar(s));

    }

    public static int firstUniqChar(String s) {
        int[] count = new int [256];

        for (int i = 0; i < s.length(); i++){
            count[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++){
            if (count[s.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar1(String s) { // with Map java library
        Map<Character, Integer> myCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (myCount.containsKey(c)){
                myCount.put(c, myCount.get(c) + 1);
            }else {
                myCount.put(c, 1);
            }
        }

        for (int i = 0; i < s.length(); i++){
            if (myCount.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
