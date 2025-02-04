package Array;

import java.util.Scanner;

public class _70_ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(climbStairs1(n));
        System.out.println(climbStairs(n));
    }

    static public int climbStairs(int n) { // Dynamic programing -> Tốn bộ nhớ do phải lưu vào mảng độ phức tạp On
        int[] dp = new int[n+1];
        dp[0] = 1; // bước 0 bậc thềm có 1 cách
        dp[1] = 1; // bước 1 bậc thềm có 1 cách
        // đây là dãy fibonacci -> bước 2 bậc thềm có 2 cách (2 times 1 step or 1 time 2 steps)

        for (int i = 2; i <= n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n];
    }

    static public int climbStairs1(int n){ // dung vong lap i -> do phuc tap o1
        int prev0 = 1;
        int prev1 = 1;
        int cur = 0;
        if (n < 2){
            return 1;
        }
        for (int i = 2; i<=n; i++){
            cur = prev1 + prev0;
            prev0 = prev1;
            prev1 = cur;
        }

        return cur;
    }

}
