package learningDSA.array;

import java.util.*;

public class _49GroupAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        _49GroupAnagrams test = new _49GroupAnagrams();
        int n = sc.nextInt();
        sc.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextLine();
        }
        System.out.println(test.groupAnagrams(array));
    }

    /**
     * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
     * Example 1:
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     * Explanation:
     * There is no string in strs that can be rearranged to form "bat".
     * The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
     * The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
     *
     * Example 2:
     * Input: strs = [""]
     * Output: [[""]]
     *
     * Example 3:
     * Input: strs = ["a"]
     * Output: [["a"]]
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> listRes = new ArrayList<>();
        Map<String, Integer> maps = new HashMap<>();
        int index = 0;
        for (String string : strs) {
            String temp = sortString(string);
            if (maps.containsKey(temp)) {
                listRes.get(maps.get(temp)).add(string);
            } else {
                maps.put(temp, index);
                List<String> list = new ArrayList<>();
                list.add(string);
                listRes.add(index, list);
                index++;
            }
        }
        return listRes;
    }

    public List<List<String>> groupAnagramsLimit(String[] strs) { // -> time limit exceed
        List<List<String>> listRes = new ArrayList<>();

        if (strs.length == 0) return listRes;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == null) continue;
            List<String> listTemp = new ArrayList<>();
            listTemp.add(strs[i]);
            String temp = sortString(strs[i]);
            for (int j = i + 1; j < strs.length; j++){
                if (strs[j] != null && temp.equals(sortString(strs[j]))) {
                    listTemp.add(strs[j]);
                    strs[j] = null;
                }
            }
            listRes.add(listTemp);
        }
        return listRes;
    }

    public String sortString(String str){
        String res = "";
        int[] array = new int[48];
        if (str.isEmpty()) return str;
        for (char c : str.toCharArray()) {
            array[c-'a'] = ++array[c-'a'];
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] > 0) {
                for (int j = 0; j < array[i]; j++){
                    res += (char) (i + 'a');
                }
            }
        }
        return res;
    }
}
