package String;

import java.util.*;

public class _1002_FindCommonCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];

        for (int i = 0; i < n; i++){
            words[i] = sc.nextLine();
        }

        _1002_FindCommonCharacters test = new _1002_FindCommonCharacters();

        System.out.println(test.commonChars(words).toString());
    }

    public List<String> commonChars(String[] words) { //15ms
        List<String> listCommonCharacters = new ArrayList<>();
        Map<Character, Integer> mapString = new HashMap<>();

        for (char character : words[0].toCharArray()) {
            if (mapString.containsKey(character)) {
                Integer value = mapString.get(character) + 1;
                mapString.put(character, value);
                continue;
            }
            mapString.put(character, 1);
        }


        for (int i = 1; i < words.length ; i++){

            int count = 0;

            for (Map.Entry<Character, Integer> map : mapString.entrySet()) {
                count = countWord(map.getKey(), words[i]);

                if (count < map.getValue() && map.getValue() > 0) {
                    map.setValue(count);
                }
            }
        }

        for (Map.Entry<Character, Integer> map : mapString.entrySet()) {
            if (map.getValue() > 0) {
                for (int i = 0; i < map.getValue(); i ++) {
                    listCommonCharacters.add(String.valueOf(map.getKey()));
                }
            }
        }

        return listCommonCharacters;
    }

    public int countWord (char  character, String word) {
        int count = 0;
        for (char wordCharacter : word.toCharArray()){
            if (character == wordCharacter) {
                count++;
            }
        }
        return count;
    }


}
