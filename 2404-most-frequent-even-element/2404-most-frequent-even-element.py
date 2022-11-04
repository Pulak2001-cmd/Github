class Solution:
    def mostFrequentEven(self, nums: List[int]) -> int:
        dicts = {}
        for i in nums:
            if i%2 == 0:
                if i in dicts:
                    dicts[i] += 1
                else:
                    dicts[i] = 1
        value = dicts.values()
        if len(value) == 0:
            return -1
        value = sorted(value)
        max_v = value[-1]
        ans = []
        for i in dicts:
            if dicts[i] == max_v:
                ans.append(i)
        return sorted(ans)[0]