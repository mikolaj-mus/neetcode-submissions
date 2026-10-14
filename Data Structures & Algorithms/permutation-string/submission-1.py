class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        s1_count, s2_count = [0] * 26, [0] * 26
        matches = 0

        for s in s1:
            s1_count[ord(s) - ord('a')] += 1
        
        l, r = 0, 0

        while r < len(s2):
            s2_count[ord(s2[r]) - ord('a')] += 1

            if r - l + 1 > len(s1):
                s2_count[ord(s2[l]) - ord('a')] -= 1
                l += 1

            if r - l + 1 == len(s1):
                for i in range(len(s1_count)):
                    if s2_count[i] == s1_count[i]:
                        matches += 1
                if matches == 26:
                    return True
                matches = 0

            r += 1

        return False
