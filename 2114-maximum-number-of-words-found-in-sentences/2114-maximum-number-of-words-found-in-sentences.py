class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        count = 0
        for i in sentences:
            arr = i.split(" ")
            count = max(count, len(arr))
        return count