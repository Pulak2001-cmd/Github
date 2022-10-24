class Solution:
    def firstUniqChar(self, s: str) -> int:
        dicts = {}
        for i in range(len(s)):
            if s[i] in dicts:
                dicts[s[i]] = 'x'
            else:
                dicts[s[i]] = i
        print(dicts)
        for j in dicts:
            if str(dicts[j]).isnumeric():
                return dicts[j]
                
        return -1
            