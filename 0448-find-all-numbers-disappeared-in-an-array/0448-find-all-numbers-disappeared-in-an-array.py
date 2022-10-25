class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        a,n=[],len(nums)
        for i in nums:
            j=abs(i)-1
            nums[j]=-1*abs(nums[j])
        for i in range(n):
            if nums[i]>0:
                a.append(i+1)
        return a