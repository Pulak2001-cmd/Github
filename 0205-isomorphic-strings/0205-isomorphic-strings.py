class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dicts = {}
        dicts1 = {}
        if len(s) != len(t):
            return False
        n = len(s)
        r = True
        for i in range(n):
            if s[i] not in dicts:
                dicts[s[i]] = t[i]
            else:
                if dicts[s[i]] != t[i]:
                    return False
        for i in range(n):
            if t[i] not in dicts1:
                dicts1[t[i]] = s[i]
            else:
                if dicts1[t[i]] != s[i]:
                    return False
        return True