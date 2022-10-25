class Solution:
    def findContentChildren(self, g: List[int], s: List[int]) -> int:
        child, cookie = 0, 0
        g.sort()
        s.sort()
        while child != len(g) and cookie != len(s):
            if s[cookie] >= g[child]:
                child += 1
                cookie += 1
            else:
                cookie += 1
        return child