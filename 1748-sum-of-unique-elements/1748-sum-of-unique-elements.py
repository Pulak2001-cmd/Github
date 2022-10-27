class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        dicts = {}
        for i in nums:
            if i in dicts:
                dicts[i] += 1
            else:
                dicts[i] = 1
        ans = 0
        for i in dicts:
            if dicts[i] == 1:
                ans += i
        return ans