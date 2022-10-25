class Solution:
    def detectCapitalUse(self, word: str) -> bool:
        upper = 0
        for i in word:
            if i.isupper():
                upper += 1
        if upper == 1:
            if word[0].isupper():
                return True
            else:
                return False
        elif upper == 0:
            return True
        elif upper == len(word):
            return True
        else:
            return False