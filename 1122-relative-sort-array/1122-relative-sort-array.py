class Solution:
    def relativeSortArray(self, arr1: List[int], arr2: List[int]) -> List[int]:
        present = {}
        absent = []
        for i in arr1:
            if i in arr2:
                if i in present:
                    present[i] += 1
                else:
                    present[i] = 1
            else:
                absent.append(i)
        absent = sorted(absent)
        res = []
        for j in arr2:
            n = present[j]
            for i in range(n):
                res.append(j)
        res += absent
        return res