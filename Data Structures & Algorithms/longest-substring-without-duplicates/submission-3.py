class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        total = 0
        char_set = set()
        l = 0
        
        for r in range(len(s)):
            while s[r] in char_set:
                char_set.remove(s[l])
                l += 1
            char_set.add(s[r])
            total = max(total, len(char_set))

        return total

