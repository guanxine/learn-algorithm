package cn.gx.learn.algorithm.dp;

public class D1 {

    /**
     * 爬楼梯
     * dp(1) = 1
     * dp(2) = 2
     * dp(n) = dp(n-1) + dp(n-2)
     *
     * n: 第 n 格
     * dp[n]: 第 n 格爬法
     * @param n
     * @return
     */
    public int climbStairsBottleUp(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i ++ ) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public int climbStairsTopUp(int n) {
        if (n <= 1) {
            return n;
        }

        int[] memo = new int[n + 1];
        return climbStairsTopUp(memo, n);
    }

    private int climbStairsTopUp(int[] memo, int n) {
        if (memo[n] != 0) {
            return memo[n];
        }

        if (n <= 1) {
            return n;
        }

        return memo[n] = climbStairsTopUp(memo, n - 1) + climbStairsTopUp(memo, n - 2);
    }

    // max subarray
    // 逐个统计到当前位置的 max subarray
    // dp[n] = max(nums[n], dp[n - 1])

    // 数组第 n 位
    // 以第 n 位为结尾的 maxSubArray 的 sum


    public static void main(String[] args) {
        D1 d1 = new D1();
        System.out.println(d1.climbStairsBottleUp(10));
    }
}
