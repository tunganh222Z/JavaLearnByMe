package Array;

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
}
