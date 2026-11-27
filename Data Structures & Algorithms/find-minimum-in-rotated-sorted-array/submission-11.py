class Solution:
    def findMin(self, nums: List[int]) -> int:
        l, r = 0, len(nums) - 1
        res = 1000

        while l <= r:
            if nums[l] < nums[r] and nums[l] < res:
                return nums[l]
            mid = (l + r) // 2
            res = min(nums[mid], res)
            if nums[l] <= nums[mid]:
                l = mid + 1
            else:
                r = mid - 1
        return res