class Solution:
    def countSegments(self, s: str) -> int:
        lists = s.split(" ")
        count = 0
        for i in lists:
            if len(i) == 0:
                continue
            else:
                count += 1
        return count