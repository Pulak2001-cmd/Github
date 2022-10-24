class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        dicts = {}
        for i in nums:
            if i in dicts:
                dicts[i] += 1
            else:
                dicts[i] = 1
        for j in dicts:
            if dicts[j] != 2:
                return j
        return 0