class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        for i in t:
            if s.find(i) == -1:
                return i
            else:
                s = s.replace(i, '', 1)

        return 0
        