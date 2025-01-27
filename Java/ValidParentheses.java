import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if (isValid(s)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean isValid(String s) {
        boolean status = false;

        Map<Character, Character> mapStr = new HashMap<>();
        mapStr.put('(', ')');
        mapStr.put('{', '}');
        mapStr.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            //push open bracket into stack
            if (mapStr.containsKey(c)){
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                }
                char topElement = stack.pop();

                if (mapStr.get(topElement) != c ){
                    return false;
                }
            }
        }

        // Nếu stack trống thì chuỗi hợp lệ, nếu không thì không hợp lệ
        return stack.isEmpty();
    }
}
