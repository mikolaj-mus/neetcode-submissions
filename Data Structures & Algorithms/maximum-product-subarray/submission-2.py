class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        max_prod, min_prod = 1, 1
        res = nums[0]

        for num in nums:
            temp = max_prod
            max_prod = max(num, max_prod * num, min_prod * num)
            min_prod = min(num, temp * num, min_prod * num)
            res = max(res, max_prod)

        return res 
