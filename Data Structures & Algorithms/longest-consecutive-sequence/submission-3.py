class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0 
        result = set()
        for num in nums:
            result.add(num)
        counter = 1
        max_counter = 1
        for num in result:
            temp = num
            if temp - 1 not in result:
                while temp + 1 in result:
                    counter += 1
                    temp += 1
                if counter > max_counter:
                    max_counter = counter
                counter = 1
        return max_counter