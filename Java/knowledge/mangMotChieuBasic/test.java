package knowledge.mangMotChieuBasic;

import java.util.*;

public class test {
    public static void main(String[] args) {
        // Test với chuỗi đầu vào
        String input = "swiss";
        char result = findFirstNonRepeatingCharacter(input);

        // In kết quả
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
    }

    public static char findFirstNonRepeatingCharacter(String str) {
        // Sử dụng LinkedHashMap để lưu trữ tần suất và đảm bảo thứ tự duyệt
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Duyệt qua chuỗi và đếm tần suất
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Duyệt qua chuỗi lần nữa để tìm ký tự không lặp
        Set<Map.Entry<Character, Integer>> entry = charCountMap.entrySet();

        for (Map.Entry<Character, Integer> test : entry){
            if (test.getValue() == 1){
                return test.getKey();
            }
        }

        // Nếu không tìm thấy ký tự nào thỏa mãn, trả về ký tự null
        return '\0';
    }

    public static void stringBuilder123 (){
        String stringTest = "testing";
        StringBuilder sb = new StringBuilder(stringTest);

        sb.append("123123");
        System.out.println(sb);
    }
}
