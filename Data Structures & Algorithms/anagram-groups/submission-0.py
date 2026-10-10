class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        resultMap = {}
        for s in strs:
            keyTab = [0] * 26
            for l in s:
                keyTab[ord(l) - 97] += 1
            resultMap.setdefault(tuple(keyTab), []).append(s)
        return list(resultMap.values())