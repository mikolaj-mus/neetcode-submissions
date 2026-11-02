class Solution:
    def findMin(self, nums: List[int]) -> int:
        if nums[0] < nums[len(nums)-1] or len(nums) == 1:
            return nums[0]
        
        for i in range(len(nums) - 2, -1, -1):
            print(i)
            if nums[i] > nums[i + 1]:
                return nums[i + 1]
        
        return 0