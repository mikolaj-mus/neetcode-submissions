class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        res = max(nums)
        maxProd, minProd = 1, 1

        for num in nums:
            temp = maxProd
            maxProd = max(num, maxProd * num, minProd * num)
            minProd = min(num, temp * num, minProd * num)
            res = max(res, maxProd)
            
        return res
        
