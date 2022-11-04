class Solution:
    def repeatedCharacter(self, s: str) -> str:
        lists = []
        for i in s:
            if i not in lists:
                lists.append(i)
            else:
                return i