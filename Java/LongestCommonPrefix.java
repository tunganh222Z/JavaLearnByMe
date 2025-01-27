import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {
        String res = "";

        Map<Integer, String> mapCharacter = new LinkedHashMap<>();

        for (int i = 0; i < strs[0].length(); i++) {
            mapCharacter.put(i, "null");
        }

        int smallestLength = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < smallestLength) {
                smallestLength = strs[i].length();

                if (smallestLength == 0) {
                    return res = "";
                }
            }
        }


        for (int i = 1; i < strs.length; i++) {
            for (int j = 0; j < smallestLength; j++) {

                if (strs[0].charAt(j) == strs[i].charAt(j) && mapCharacter.get(j) == "null") {
                    mapCharacter.put(j, "true");
                }

                if (strs[0].charAt(j) != strs[i].charAt(j) && (mapCharacter.get(j) == "true" || mapCharacter.get(j) == "null")) {
                    mapCharacter.put(j, "false");
                    break;
                }
            }
        }


        if (strs.length == 1) {
            res = strs[0];
        } else {
            for (int i = 0; i < mapCharacter.size(); i++) {
                if (!(mapCharacter.get(0) == "true")) {
                    res = "";
                } else if (mapCharacter.get(i) == "true") {
                    res = res + strs[0].charAt(i);
                } else {
                    break;
                }
            }
        }

        return res;
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int pos = 0;
        String result = "";
        char currentChar;

        while (pos < strs[0].length()) {
            currentChar = strs[0].charAt(pos);
            for(String str : strs) {
                if (pos >= str.length() || currentChar != str.charAt(pos)) {
                    return result;
                }
            }
            result += currentChar;
            pos++;
        }


        return result;
    }

    public String longestCommonPrefixBest(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String result = strs[0];
        int pos = 1;
        while (pos < strs.length && result != "") {
            result = commonPrefix(result, strs[pos]);
            pos++;
        }
        return result;
    }

    private String commonPrefix(String s1, String s2) {
        int pos = 0;
        while (pos < s1.length() && pos < s2.length() && s1.charAt(pos) == s2.charAt(pos)) {
            pos++;
        }
        return s1.substring(0, pos);
    }
}
