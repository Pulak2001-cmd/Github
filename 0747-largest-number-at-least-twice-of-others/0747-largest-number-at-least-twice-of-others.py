class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        res = sorted(nums)
        mx = res[-1]
        mx2 = res[-2]
        if mx >= 2*mx2:
            return nums.index(mx)
        return -1