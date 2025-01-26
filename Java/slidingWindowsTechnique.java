import java.util.Scanner;

public class slidingWindowsTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        boolean[] visited = new boolean[256];
        int maxLength = 0;
        for ( int end = 0; end < chars.length; end ++){
            if (visited [ chars[end] ]){
                start++;
            }
            visited[chars[end]] = true;
            maxLength = Math.max(maxLength, end - start+1);
        }
        return maxLength;
    }
}


/*
thêm các ký tự vào trong mảng boolean
    - nếu chưa có thì set là true
    lặp qua
**/