class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        dicts = {}
        nums1 = list(set(nums1))
        nums2 = list(set(nums2))
        nums3 = list(set(nums3))
        for i in nums1:
            if i in dicts:
                dicts[i] += 1
            else:
                dicts[i] = 1
        for i in nums2:
            if i in dicts:
                dicts[i] += 1
            else:
                dicts[i] = 1
        for i in nums3:
            if i in dicts:
                dicts[i] += 1
            else:
                dicts[i] = 1
        res = []
        for i in dicts:
            if dicts[i] >= 2:
                res.append(i)
        return res