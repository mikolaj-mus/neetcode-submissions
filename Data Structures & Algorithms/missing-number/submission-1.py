class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = 0
        
        for num in range(len(nums) + 1):
            n += num
        
        for num in nums:
            n -= num
        
        return n