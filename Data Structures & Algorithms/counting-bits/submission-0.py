class Solution:
    def countBits(self, n: int) -> List[int]:
        res = []

        for i in range(n+1):
            n = i
            temp = 0
            while n > 0:
                temp += 1
                n = n & (n - 1)
            res.append(temp)
        return res