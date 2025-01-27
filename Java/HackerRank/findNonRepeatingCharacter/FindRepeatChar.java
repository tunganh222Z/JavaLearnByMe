package HackerRank.findNonRepeatingCharacter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindRepeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        char[] aChars = a.toCharArray();

        Map<Character, Integer> linkedHashMap = new LinkedHashMap<>();

        for (int i = 0; i < a.length(); i++){
            if (linkedHashMap.containsKey(aChars[i])){
                int count = linkedHashMap.get(aChars[i]);
                count++;
                linkedHashMap.put(aChars[i], count);
            } else {
                linkedHashMap.put(aChars[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : linkedHashMap.entrySet()){
            if (entry.getValue() > 1){
                System.out.println("Character Repeating is :" + entry.getKey());
            }
        }
    }
}
