class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1]*len(nums)
        n = len(nums)

        i = 1
        while i < n:
            result[i] = nums[i-1] * result[i-1]
            i += 1

        suffix = 1
        for i in range(n - 1, -1, -1):
            result[i] *= suffix
            suffix *= nums[i]
        
        return result