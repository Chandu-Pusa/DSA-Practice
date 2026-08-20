class MinCostClimbT {
    static int minCost(int[]cost, int[] dp) {
        int mincost = 0;
        dp[0] = 0;
        dp[1] = 0;
        for(int i=2;i<cost.length;i++) {
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]); 
        }
        return mincost;
    }
}