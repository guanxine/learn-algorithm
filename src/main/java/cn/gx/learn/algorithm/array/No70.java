package cn.gx.learn.algorithm.array;

public class No70 {


    /**
     * 1 -> n
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    // n -> 1
    public int climbStairs_1(int n) {
        if (n <= 2) {
            return n;
        }
        int[] memo = new int[n + 1];
        return helper(n, memo);
    }

    private int helper(int n, int[] memo) {
        if (n <= 2) {
            return n;
        }

        if (memo[n] != 0) {
            return memo[n];
        }
        return memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
    }

    public static void main(String[] args) {

    }
}
