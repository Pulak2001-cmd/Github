class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        words = text.split(" ")
        count = 0
        for i in words:
            x = 0
            for j in i:
                if j in brokenLetters:
                    x = 1
                    break
            if x == 0:
                count += 1
        return count