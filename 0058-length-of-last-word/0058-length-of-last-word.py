class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        lists = s.split(" ")
        lists = list(filter(lambda a: a != '', lists))
        print(lists)
        return len(lists[-1])