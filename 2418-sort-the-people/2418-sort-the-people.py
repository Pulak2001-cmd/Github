class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        dicts = {}
        for i in range(len(names)):
            dicts[heights[i]] = names[i]
        heights = sorted(heights)[::-1]
        ans = []
        for i in heights:
            ans.append(dicts[i])
        return ans