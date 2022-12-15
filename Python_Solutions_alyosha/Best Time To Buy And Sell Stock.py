class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        b = inf
        c = 0
        t = 0
        
        for i in range(len(prices)):
            t = prices[i]
            if t < b:
                b = t
            if t - b > c:
                c = t - b      
        return c

    