// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

function maxProfit(prices: number[]): number {
    let profit = 0
    for (let i = 0; i < prices.length; i++) {
        if (prices[i] < prices[i + 1]) { // If price is higher the next day
            profit += prices[i + 1] - prices[i] // Profit = profit for selling next day - buying price
        }
    }
    return profit

};

console.log(maxProfit([7, 1, 5, 3, 6, 4]))