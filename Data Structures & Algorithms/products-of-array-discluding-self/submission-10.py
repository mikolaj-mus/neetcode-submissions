class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1] * len(nums)

        for i in range(len(nums) - 1):
            result[i+1] *= nums[i] * result[i]

        prefix = 1
        for i in range(len(nums) - 1, 0, -1):
            prefix *= nums[i]
            result[i-1] *= prefix

        return result
