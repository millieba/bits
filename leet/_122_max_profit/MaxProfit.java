// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

package leet._122_max_profit;

public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) { // If tomorrow's price is higher than today's
                totalProfit += prices[i + 1] - prices[i]; // Profit = profit for selling next day - buying price
            }
        }
        System.out.println(totalProfit);
        return totalProfit;
    }

    public static void main(String[] args) {
        maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });
    }

}
