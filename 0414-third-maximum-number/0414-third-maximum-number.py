class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        x = set()
        for i in nums:
            x.add(i)
        x = list(x)
        x = sorted(x)
        if len(x) == 2 or len(x) == 1:
            return max(x)
        return x[-3]
            