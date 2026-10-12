class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result1, result2 = [1]*len(nums), [1]*len(nums)
        
        i = 1
        while i < len(nums):
            result1[i] = nums[i-1] * result1[i-1]
            i += 1

        i -= 2
        while i > -1:
            result2[i] = nums[i+1] * result2[i+1]
            i -= 1
        
        for i, num in enumerate(result1):
            result2[i] *= num
        
        return result2