class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        answer = []
        x = set()
        for i in nums1:
            if i not in nums2:
                x.add(i)
        answer.append(list(x))
        y = set()
        for i in nums2:
            if i not in nums1:
                y.add(i)
        answer.append(list(y))
        return answer