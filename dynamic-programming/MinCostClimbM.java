import java.util.Arrays;

public class MinCostClimbM {

    static int minCost(int i, int[] cost, int[] dp) {

        if (i >= cost.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        dp[i] = cost[i] + Math.min(
            minCost(i + 1, cost, dp),
            minCost(i + 2, cost, dp)
        );

        return dp[i];
    }

    static int solve(int[] cost) {

        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);

        return Math.min(
            minCost(0, cost, dp),
            minCost(1, cost, dp)
        );
    }
}