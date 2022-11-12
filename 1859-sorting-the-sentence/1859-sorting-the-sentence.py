class Solution:
    def sortSentence(self, s: str) -> str:
        words = s.split(" ")
        dicts = {}
        for i in words:
            dicts[int(i[-1])] = i[:-1]
        ans = ""
        for i in range(1, len(words)+1):
            ans += dicts[i]+" "
        return ans[:-1]