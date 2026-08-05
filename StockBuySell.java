import java.util.*;

public class StockBuySell {

    public static int maxProfit(int[] prices) {

        // Write your logic here
        int min = prices[0], profit = 0, max = 0;

        for(int i = 1;i<prices.length;i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] prices = {7,10,1,3,6,9,2};

        int result = maxProfit(prices);

        System.out.println(result);

        sc.close();
    }
}