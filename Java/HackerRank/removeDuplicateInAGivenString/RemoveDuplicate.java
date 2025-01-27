package HackerRank.removeDuplicateInAGivenString;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        char[] aChars = a.toCharArray();

        Set<Character> linkedHashSet = new LinkedHashSet<>();

        for (char aChar : aChars){
            linkedHashSet.add(aChar);
        }

        StringBuilder removeDuplicateChar = new StringBuilder();
        for (char character : linkedHashSet){
            removeDuplicateChar.append(character);
        }

        System.out.println(removeDuplicateChar);
    }
}
