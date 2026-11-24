class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit, l = 0, 0

        for r in range(len(prices)):
            if prices[l] > prices[r]:
                l = r
                continue
            cur_profit = prices[r] - prices[l]
            max_profit = max(max_profit, cur_profit)
        return max_profit