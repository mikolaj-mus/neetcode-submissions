class Solution:
    def climbStairs(self, n: int) -> int:
        stair_left, stair_right = 1, 0

        for _ in range(n):
            stair_left, stair_right = stair_left + stair_right, stair_left

        return stair_left
