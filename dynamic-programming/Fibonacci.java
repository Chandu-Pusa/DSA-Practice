import java.util.*;

class Fibonacci {
    static int fibonacci(int n) {

        // int[] dp = new int[n+1];
        // Arrays.fill(dp, -1);
        // if(dp[n] != -1) return dp[n];

        if(n<=1) return n;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}