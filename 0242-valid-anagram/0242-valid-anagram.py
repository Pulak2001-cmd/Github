class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        dict1 = {}
        dict2 = {}
        n = len(s)
        for i in range(n):
            if s[i] in dict1:
                dict1[s[i]] += 1
            else:
                dict1[s[i]] = 1
            if t[i] in dict2:
                dict2[t[i]] += 1
            else:
                dict2[t[i]] = 1
        if dict1 == dict2:
            return True
        return False