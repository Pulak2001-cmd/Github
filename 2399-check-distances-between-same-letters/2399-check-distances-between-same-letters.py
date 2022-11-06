class Solution:
    def checkDistances(self, s: str, distance: List[int]) -> bool:
        dicts = {}
        for i in range(len(s)):
            if s[i] in dicts:
                dicts[s[i]].append(i)
            else:
                dicts[s[i]] = [i]
        print(dicts)
        for i in dicts:
            x = ord(i)-ord('a')
            arr = dicts[i]
            diff = arr[1] - arr[0]
            if distance[x] != diff - 1:
                return False
        return True
            