class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        
        l = 0
        result = 0
        max_freq = 0
        freq = {}

        for r in range(len(s)):
            freq[s[r]] = freq.get(s[r], 0) + 1
            max_freq = max(max_freq, freq[s[r]])

            while r - l + 1 - max_freq > k:
                freq[s[l]] -= 1
                l += 1
            
            result = max(result, r - l + 1)
        return result
        
