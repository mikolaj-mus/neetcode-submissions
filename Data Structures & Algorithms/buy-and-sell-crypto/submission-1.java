class Solution {
    public int maxProfit(int[] prices) {
       int i = 0;
       int profit = 0;

       for (int j = 1; j < prices.length; j++) {
        profit = Math.max(profit, prices[j] - prices[i]);
        if (prices[i] > prices[j]) {
            i = j;
        }
       }
       return profit;
    }
}
