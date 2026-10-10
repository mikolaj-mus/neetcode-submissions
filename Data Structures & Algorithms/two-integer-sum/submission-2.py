class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        targetMap = {}
        for i, num in enumerate(nums):
            if (target - num in targetMap):
                return [targetMap[target - num], i]
            targetMap[num] = i
        return []