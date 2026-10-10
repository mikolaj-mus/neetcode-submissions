class Solution:

    def encode(self, strs: List[str]) -> str:
        encoded = ""
        for s in strs:
            encoded += str(len(s)) + "#" + s
        return encoded

    def decode(self, s: str) -> List[str]:
        number = ""
        result = []
        index = 0
        while len(s) != 0:
            if s[index].isdigit():
                number += s[index]
                index += 1
            else:
                number = int(number)
                result.append(s[index+1:index+number+1])
                s = s[index+number+1:]
                index = 0
                number = ""
        return result
